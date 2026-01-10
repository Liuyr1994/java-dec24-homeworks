package ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.network;

import ru.otus.java.basic.homeworks.homework13.gemini.hub_master_pro.service.AsyncHubService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class HubServer {
    private final AsyncHubService asyncHubService;

    public HubServer(AsyncHubService asyncHubService) {
        this.asyncHubService = asyncHubService;
    }

    public void start(int port) {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (true) {

                try (Socket clientSocket = serverSocket.accept();
                     BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
                ) {

                    String input = in.readLine();
                    if (input != null) {
                        asyncHubService.processAsync(input);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при общении с клиентом: " + e.getMessage());
        }
    }
}
