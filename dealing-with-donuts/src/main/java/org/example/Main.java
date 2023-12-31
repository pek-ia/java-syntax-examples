package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello donuts!");

        // Create a donut
        Donut d = null;
        String fileName = "donuts.csv";

        d = readDonutFromFile(fileName);

        // Print a donut
        System.out.println(d);

    }

    private static ArrayList<Donut> readAllDonutsFromFile(String fileName){
        ArrayList<Donut> donuts = new ArrayList<>();

        return donuts;
    }

    private static Donut readDonutFromFile(String fileName) {
        Donut d;
        // Read a donut
        try (BufferedReader donutFileReader = openFileReader(fileName)){
            String donutString = donutFileReader.readLine();
            String[] donutData = donutString.split("\\|");
            // Convert each string to the correct type
            String name = donutData[0];
            int calories = Integer.parseInt(donutData[1]);
            double price = Double.parseDouble(donutData[2]);

            // donutDate[3] has the production date
            LocalDate productionDate = LocalDate.parse(donutData[3]);

            // Time to make the donut!
            d = new Donut(name, calories, price, productionDate);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return d;
    }

    private static BufferedReader openFileReader(String fileName) throws FileNotFoundException {
        BufferedReader donutFileReader;
        donutFileReader = new BufferedReader(new FileReader(fileName));
        return donutFileReader;
    }
}