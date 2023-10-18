package org.example;

public class Main {
    public static void main(String[] args) {

        Donut cronut = new Donut(9000, 100.0, false,
                "Cronut Imperial Supreme",
                "You can't afford it, but you can't eat just one!");
        Donut dietDonut = new Donut(90, 7.0, false,
                "Diet donut",
                "Why you hate the donut so much?");

        // Can't call private method
        // cronut.setCalories(15);

        System.out.println(cronut.getName() + " has " + cronut.getCalories() + " calories");
        System.out.println(dietDonut.getName() + " has " + dietDonut.getCalories() + " calories");

        Donut betterDonut = cronut.getPricePerCalorie() < dietDonut.getPricePerCalorie() ? cronut : dietDonut;

        System.out.println("On a calories/dollar basis, the better deal is: " + betterDonut.getName());
    }
}