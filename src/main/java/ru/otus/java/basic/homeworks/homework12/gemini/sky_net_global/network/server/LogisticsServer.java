package ru.otus.java.basic.homeworks.homework12.gemini.sky_net_global.network.server;

import ru.otus.java.basic.homeworks.homework12.gemini.sky_net_global.model.Cargo;
import ru.otus.java.basic.homeworks.homework12.gemini.sky_net_global.model.Taxable;
import ru.otus.java.basic.homeworks.homework12.gemini.sky_net_global.service.CargoParser;
import ru.otus.java.basic.homeworks.homework12.gemini.sky_net_global.service.FileHistoryService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.net.ServerSocket;
import java.net.Socket;

public class LogisticsServer {
    public void start() {
        try (ServerSocket socket = new ServerSocket(8081)) {
            FileHistoryService fileHistoryService = new FileHistoryService();
            while (true) {
                Socket clientSocket = socket.accept();
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                     PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {
                    String input = reader.readLine();
                    if (input != null) {
                        try {
                            Cargo cargo = CargoParser.parse(input);
                            BigDecimal total = cargo.calculateShippingCost();
                            if (cargo instanceof Taxable taxableCargo) {
                                BigDecimal tax = taxableCargo.calculateTax(total);
                                total = total.add(tax);
                            }
                            fileHistoryService.save(cargo, total, "history.txt");
                            out.println("Груз " + cargo.getId() + " принят. Итоговая стоимость: " + total);
                        } catch (Exception e) {
                            out.println("Ошибка: проверьте формат данных.");
                        }
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
