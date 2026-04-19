package ru.otus.java.basic.homeworks.homework20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainApplication {
    private static String sym = "A";
    private static Object monitor = new Object();

    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(3);
        ex.execute(() -> {
            for (int i = 0; i < 5; i++) {
                synchronized (monitor) {
                    try {
                        while (!sym.equals("A")) {
                            monitor.wait();
                        }
                        System.out.print(sym);
                        monitor.notifyAll();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    sym = "B";
                }
            }
        });
        ex.execute(() -> {
            for (int i = 0; i < 5; i++) {
                synchronized (monitor) {
                    try {
                        while (!sym.equals("B")) {
                            monitor.wait();
                        }
                        System.out.print(sym);
                        monitor.notifyAll();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    sym = "C";
                }
            }
        });
        ex.execute(() -> {
            for (int i = 0; i < 5; i++) {
                synchronized (monitor) {
                    try {
                        while (!sym.equals("C")) {
                            monitor.wait();
                        }
                        System.out.print(sym);
                        monitor.notifyAll();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    sym = "A";
                }
            }
        });

        ex.shutdown();
    }
}
