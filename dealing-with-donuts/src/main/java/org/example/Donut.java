package org.example;

public class Donut {

    private String name;
    private int calories;
    private double price;

    @Override
    public String toString() {
        return "Donut{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }

    public Donut(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }
}
