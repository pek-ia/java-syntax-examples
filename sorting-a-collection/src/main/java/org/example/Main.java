package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Donuts!");

        // A collection that holds donuts
        ArrayList<Donut> donuts = new ArrayList<>();

        donuts.add( new Donut("Cronut Supreme", 7000, 22.49));
        donuts.add( new Donut("Maple", 255, 1.19));
        donuts.add( new Donut("Chocolate", 260, 1.79));
        donuts.add( new Donut("Cronut Lite", 799, 9.99));
        donuts.add( new Donut("Plain", 220, .99));


        // Print out the donuts!
        printAllDonuts("========= DONUTS ===========",
                donuts);

        /*
         * Sorting a collection is just like sorting an array, except
         * we use the java.util.Collections class instead of java.util.Arrays
         */
        // EXAMPLE 1 -
        // SORT USING A COMPARATOR CLASS
        // Look at the class CompareDonutsByCalories


        Comparator<Donut> comparer = new CompareDonutsByCalories();
        Collections.sort(donuts, comparer);

        // Print out the donuts!
        printAllDonuts("========= SORTED DONUTS ===========",
                donuts);


        // EXAMPLE 2 - SORT THE DONUTS USING A LAMBDA EXPRESSION
        // Look at the lambda expression
        // It takes the place of the Comparator class

        // Sort by calories, descending
        Collections.sort(donuts, (d1, d2) -> {
            if (d1 == d2) return 0;
            else return d2.getCalories() - d1.getCalories();
        });

        // Print out the donuts!
        printAllDonuts("========= RE-SORTED DONUTS ===========",
                donuts);
    }

    private static void printAllDonuts(String title, ArrayList<Donut> donuts) {
        System.out.println(title);
        for (Donut d : donuts) {
            System.out.println(d);
        }
    }
}