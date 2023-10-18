package org.example;

public class Donut {
    public Donut(int calories, double price, boolean hasSprinkles, String name, String description) {
        this.calories = calories;
        this.price = price;
        this.hasSprinkles = hasSprinkles;
        this.name = name;
        this.description = description;
    }

    private int calories;
    private double price;
    private boolean hasSprinkles;
    private String name;
    private String description;

    public int getCalories() {
        return calories;
    }

    private void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasSprinkles() {
        return hasSprinkles;
    }

    public void setHasSprinkles(boolean hasSprinkles) {
        this.hasSprinkles = hasSprinkles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Donut{" +
                "calories=" + calories +
                ", price=" + price +
                ", hasSprinkles=" + hasSprinkles +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
