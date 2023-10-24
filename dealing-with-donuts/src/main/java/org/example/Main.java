package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello donuts!");

        // Create a donut
        Donut d = null;

        // Read a donut
        BufferedReader donutFileReader = null;
        try {
            donutFileReader = new BufferedReader(new FileReader("donuts.csv"));
            String donutString = donutFileReader.readLine();
            String[] donutData = donutString.split("\\|");
            // Convert each string to the correct type
            String name = donutData[0];
            int calories = Integer.parseInt(donutData[1]);
            double price = Double.parseDouble(donutData[2]);

            // Time to make the donut!
            d = new Donut(name, calories, price);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Print a donut
        System.out.println(d);

    }
}