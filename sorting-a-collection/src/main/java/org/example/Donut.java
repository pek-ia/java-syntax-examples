package org.example;

public class Donut {
    String name;
    int calories;
    double price;

    public Donut(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Donut{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
