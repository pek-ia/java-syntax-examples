package org.example;

public class Main {
    public static void main(String[] args) {

        Donut d1 = new Donut(9000, 100.0, false,
                "Cronut Imperial Supreme",
                "You can't afford it, but you can't eat just one!");
        Donut d2 = new Donut(90, 7.0, false,
                "Diet donut",
                "Why you hate the donut so much?");

        // d1.setCalories(15);

        System.out.println(d1.getName() + " has " + d1.getCalories() + " calories");
        System.out.println(d2.getName() + " has " + d2.getCalories() + " calories");

    }
}