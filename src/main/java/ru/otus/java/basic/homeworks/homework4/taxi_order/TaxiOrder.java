package ru.otus.java.basic.homeworks.homework4.taxi_order;

public class TaxiOrder {
    private String clientName;
    private int distanceKm;
    private int tariffPerKm;
    private String status = "new";

    public String getStatus() {
        return status;
    }

    public TaxiOrder(String clientName, int distanceKm, int tariffPerKm) {
        this.clientName = clientName;
        this.distanceKm = distanceKm;
        this.tariffPerKm = tariffPerKm;
    }

    public void accept() {
        status = "accepted";
    }

    public void complete() {
        status = "done";
    }

    public int calculatePrice() {
        return distanceKm * tariffPerKm;
    }

    @Override
    public String toString() {
        return "TaxiOrder{" +
                "clientName='" + clientName + '\'' +
                ", distanceKm=" + distanceKm +
                ", tariffPerKm=" + tariffPerKm +
                ", status='" + status + '\'' +
                '}';
    }
}
