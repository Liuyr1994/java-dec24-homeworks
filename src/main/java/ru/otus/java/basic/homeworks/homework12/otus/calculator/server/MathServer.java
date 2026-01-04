package ru.otus.java.basic.homeworks.homework12.otus.calculator.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MathServer {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(8080)) {
            System.out.println("Сервер запущен и ждет клиента...");
            while (true) {
                try (Socket clientSocket = server.accept();
                     BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                     PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);) {
                    System.out.println("Клиент подключился");
                    out.println("Привет! Я калькулятор. Введи 2 числа и знак (+, -, *, /)");
                    String num1 = in.readLine();
                    String num2 = in.readLine();
                    String operation = in.readLine();
                    if (num1 != null && num2 != null && operation != null) {
                        double a = Double.parseDouble(num1);
                        double b = Double.parseDouble(num2);
                        double result = 0;

                        switch (operation) {
                            case "+":
                                result = a + b;
                                break;
                            case "-":
                                result = a - b;
                                break;
                            case "*":
                                result = a * b;
                                break;
                            case "/":
                                result = (b != 0) ? a / b : 0;
                                break;
                        }
                        out.println("Результат: " + result);
                    }
                    System.out.println("Клиент обслужен. Жду следующего...");
                } catch (Exception e) {
                    System.out.println("Ошибка при работе с клиентом: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
