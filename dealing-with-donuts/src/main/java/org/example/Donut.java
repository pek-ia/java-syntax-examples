package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Donut {

    private String name;
    private int calories;
    private double price;
    private LocalDate productionDate;
    private LocalDate expirationDate;

    @Override
    public String toString() {
        return "Donut{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", productionDate=" + productionDate +
                ", expirationDate=" + expirationDate +
                '}';
    }

    public Donut(String name, int calories, double price, LocalDate productionDate) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.productionDate = productionDate;
        this.expirationDate = productionDate.plusDays(7);
    }

}
