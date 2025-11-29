package ru.otus.java.basic.homeworks.homework6.gemini.smart_house;

import java.util.Arrays;

public class SmartHouse {
    private final Device[] devices;

    public SmartHouse(Device[] devices) {
        this.devices = Arrays.copyOf(devices, devices.length);
    }

    public void masterSwitch(boolean state) {
        for (Device device : devices) {
            if (state) {
                device.powerOn();
            } else {
                device.powerOff();
            }
        }
    }

    public String getHouseStatus() {
        if (devices == null || devices.length == 0) {
            return "Пустой дом";
        }
        StringBuilder sb = new StringBuilder();
        for (Device device : devices) {
            sb.append(device.getStatus()).append("\n");
        }
        return sb.toString();
    }
}
