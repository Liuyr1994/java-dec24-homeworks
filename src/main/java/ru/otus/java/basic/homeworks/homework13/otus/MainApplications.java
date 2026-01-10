package ru.otus.java.basic.homeworks.homework13.otus;

public class MainApplications {
    public static void computeLargeArray() {
        double[] arr = new double[100_000_000];
        long start = System.currentTimeMillis();
        applyFormula(arr, 0, arr.length);
        long end = System.currentTimeMillis();
        System.out.println("1 поток: " + (end - start));
    }


    public static void measureComputationTime() throws InterruptedException {
        double[] arr = new double[100_000_000];
        int size = arr.length;
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            applyFormula(arr, 0, size / 4);
        });
        Thread t2 = new Thread(() -> {
            applyFormula(arr, size / 4, size / 2);
        });
        Thread t3 = new Thread(() -> {
            applyFormula(arr, size / 2, size * 3 / 4);
        });

        Thread t4 = new Thread(() -> {
            applyFormula(arr, size * 3 / 4, size);
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        long end = System.currentTimeMillis();
        System.out.println("Многопоточное время (4 потока): " + (end - start));
    }

    private static void applyFormula(double[] arr, int start, int end) {
        for (int i = start; i < end; i++) {
            arr[i] = (double) (1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2));
        }
    }

    public static void main(String[] args) throws InterruptedException {
        computeLargeArray();
        System.out.println();
        measureComputationTime();

    }
}
