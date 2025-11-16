package ru.otus.java.basic.homeworks.homework4.sensor;

public class MainApplication {
    public static void main(String[] args) {
        Sensor[] sensors = new Sensor[10];
        sensors[0] = new Sensor("motion", Math.random() * 1);
        sensors[1] = new Sensor("temperature", Math.random() * 5);
        sensors[2] = new Sensor("smoke", Math.random() * 5);
        sensors[3] = new Sensor("smoke", Math.random() * 2.5);
        sensors[4] = new Sensor("temperature", Math.random() * 50);
        sensors[5] = new Sensor("motion", Math.random() * 5);
        sensors[6] = new Sensor("temperature", Math.random() * 50);
        sensors[7] = new Sensor("smoke", Math.random() * 2);
        sensors[8] = new Sensor("motion", Math.random() * 5);
        sensors[9] = new Sensor("temperature", Math.random() * 50);


        for (int i = 0; i < sensors.length; i++) {
            if (i % 2 == 0) {
                sensors[i].activate();
            }
        }

        int activeSensorCount = 0;

        Sensor maxValue = sensors[0];

        for (int i = 0; i < sensors.length; i++) {
            if (sensors[i].isAlarm() == true) {
                System.out.println("Этот датчик с тревогой: " + sensors[i].toString());
            }

            if (sensors[i].isActive()) {
                activeSensorCount++;
            }

            if (sensors[i].getValue() > maxValue.getValue()) {
                maxValue = sensors[i];
            }
        }

        System.out.println("Количество активных датчиков: " + activeSensorCount);
        System.out.println("Максимальное значение датчика = " + maxValue.toString());
    }
}
