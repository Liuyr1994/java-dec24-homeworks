package ru.otus.java.basic.homeworks.homework6.gemini.smart_house;

public abstract class Device {
    private final String name;
    private boolean isOn;

    public Device(String name, boolean isOn) {
        this.name = name;
        this.isOn = isOn;
    }

    public void powerOn() {
        this.isOn = true;
    }

    public void powerOff() {
        this.isOn = false;
    }

    public String getStatus() {
        return name + " is " + (isOn ? "ON" : "OFF");
    }
}
