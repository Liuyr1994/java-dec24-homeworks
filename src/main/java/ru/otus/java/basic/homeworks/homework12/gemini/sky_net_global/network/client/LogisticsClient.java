package ru.otus.java.basic.homeworks.homework12.gemini.sky_net_global.network.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class LogisticsClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8081);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите данные");
            String userInput = console.readLine();
            out.println(userInput);
            String response = in.readLine();
            System.out.println("Сервер ответил: " + response);
        } catch (Exception e) {
            System.out.println("Сбой в работе клиента");
        }
    }
}
