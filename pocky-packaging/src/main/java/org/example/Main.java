package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Package p1 = new Package(9, 7, Flavor.CHOCOLATE, 3.99);
        System.out.println(p1.getPricePerPocky());
        Package p2 = new Package(1, 26, Flavor.CHOCOLATE, 1.50);
        System.out.println(p2.getPricePerPocky());
    }
}