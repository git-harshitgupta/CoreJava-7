package com.app.vehicle;

public class Vehicle {
    private String registration_no;
    private String color;
    private double price;

    public Vehicle(String registration_no, String color, double price) {
        this.registration_no = registration_no;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "registration_no='" + registration_no + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vehicle)
            return registration_no.equals(((Vehicle) obj).registration_no);
        else
            return false;
    }
}
