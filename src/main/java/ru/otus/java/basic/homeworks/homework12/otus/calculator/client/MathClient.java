package ru.otus.java.basic.homeworks.homework12.otus.calculator.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MathClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8080);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             Scanner scanner = new Scanner(System.in)) {
            String serverHello = in.readLine();
            System.out.println("SERVER = " + serverHello);

            System.out.print("Введите первое число: ");
            String num1 = scanner.nextLine();
            out.println(num1);

            System.out.print("Введите первое число: ");
            String num2 = scanner.nextLine();
            out.println(num2);

            System.out.print("Введите операцию (+, -, *, /): ");
            String op = scanner.nextLine();
            out.println(op);

            String result = in.readLine();
            System.out.println("ОТВЕТ ОТ СЕРВЕРА: " + result);
            
        } catch (IOException e) {
            System.err.println("Ошибка: Не удалось подключиться. Проверь, запущен ли Сервер!");
        }
    }
}
