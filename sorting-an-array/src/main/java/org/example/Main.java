package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Donuts!");

        // An array that holds 5 donuts
        Donut[] donuts = new Donut[5];

        donuts[0] = new Donut("Cronut Supreme", 7000, 22.49);
        donuts[1] = new Donut("Maple", 255, 1.19);
        donuts[2] = new Donut("Chocolate", 260, 1.79);
        donuts[3] = new Donut("Cronut Lite", 799, 9.99);
        donuts[4] = new Donut("Plain", 220, .99);


        // Print out the donuts!
        printAllDonuts("========= DONUTS ===========",
                donuts);

        // EXAMPLE 1 -
        // SORT USING A COMPARATOR CLASS
        // Look at the class CompareDonutsByCalories


        Comparator<Donut> comparer = new CompareDonutsByCalories();
        Arrays.sort(donuts, comparer);

        // Print out the donuts!
        printAllDonuts("========= SORTED DONUTS ===========",
                donuts);


        // EXAMPLE 2 - SORT THE DONUTS USING A LAMBDA EXPRESSION
        // Look at the lambda expression
        // It takes the place of the Comparator class

        // Sort by calories, descending
        Arrays.sort(donuts, (d1, d2) -> {
            if (d1 == d2) return 0;
            else return d2.getCalories() - d1.getCalories();
        });

        // Print out the donuts!
        printAllDonuts("========= RE-SORTED DONUTS ===========",
                donuts);
    }

    private static void printAllDonuts(String title, Donut[] donuts) {
        System.out.println(title);
        for (Donut d : donuts) {
            System.out.println(d);
        }
    }
}