package ru.otus.java.basic.homeworks.homework4.sensor;

public class Sensor {

    private String type;
    private boolean active;
    private double value;

    public double getValue() {
        return value;
    }

    public boolean isActive() {
        return active;
    }

    public Sensor(String type, double value) {
        this.type = type;
        this.value = value;
    }

    public void activate() {
        active = true;
    }

    public void deactivate() {
        active = false;
    }

    public void updateValue(double v) {
        value = v;
    }

    public boolean isAlarm() {
        if (type.equalsIgnoreCase("motion") && value > 0) {
            return true;
        } else if (type.equalsIgnoreCase("temperature") && value > 50) {
            return true;
        } else if (type.equalsIgnoreCase("smoke") && value > 0.5) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "type='" + type + '\'' +
                ", active=" + active +
                ", value=" + value +
                '}';
    }
}
