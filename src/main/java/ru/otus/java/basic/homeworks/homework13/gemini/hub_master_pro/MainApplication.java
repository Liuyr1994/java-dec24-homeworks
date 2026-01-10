package ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro;

import ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.io.FileStorageHandler;
import ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.network.HubServer;
import ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.repository.WarehouseRepository;
import ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.service.AsyncHubService;

import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        // 1. Инициализация ядра системы
        WarehouseRepository repository = new WarehouseRepository();
        AsyncHubService service = new AsyncHubService(repository);

        // 2. Восстановление данных из файла (если файл существует)
        System.out.println("Загрузка данных из файла...");
        List<String> history = FileStorageHandler.importData("warehouse.txt");
        for (String command : history) {
            service.processAsync(command);
        }

        // 3. Настройка автосохранения при выключении (Shutdown Hook)
        // Этот код сработает сам, когда ты нажмешь "Stop" в IDE
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("\n[Система] Завершение работы. Сохранение данных...");
            FileStorageHandler.exportData(repository.getAll(), "warehouse.txt");
            System.out.println("[Система] Данные успешно сохранены в warehouse.txt");
        }));

        // 4. Запуск сетевого сервера
        // ВНИМАНИЕ: Эта строчка заблокирует выполнение дальше (внутри бесконечный цикл)
        HubServer server = new HubServer(service);
        int port = 8888;
        System.out.println("[Сервер] Ожидание команд на порту " + port + "...");
        server.start(port);
    }
}