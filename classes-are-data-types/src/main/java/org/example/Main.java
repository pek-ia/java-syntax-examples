package org.example;

public class Main {
    public static void main(String[] args) {

        /*
         * Donut is a data type - it can be used to declare variables
         */

        Donut cronut;
        Donut dietDonut;

        /*
         * To create an instance of a Donut use the "new" keyword,
         *    and call a constructor
         *
         * Here are two new instances of the Donut class:
         */

        cronut = new Donut(9000, 100.0, false,
                "Cronut Imperial Supreme",
                "You can't afford it, but you can't eat just one!");

        dietDonut = new Donut(90, 7.0, false,
                "Diet donut",
                "Why do you hate donuts so much?");

        // You can't call private methods
        // cronut.setCalories(15);

        /*
         * but you can call public methods to get information
         *    about each donut
         */
        System.out.println(cronut.getName() + " has " + cronut.getCalories() + " calories");
        System.out.println(dietDonut.getName() + " has " + dietDonut.getCalories() + " calories");

        Donut betterDonut = cronut.getPricePerCalorie() < dietDonut.getPricePerCalorie() ? cronut : dietDonut;

        System.out.println("On a calories/dollar basis, the better deal is: " + betterDonut.getName());
    }
}