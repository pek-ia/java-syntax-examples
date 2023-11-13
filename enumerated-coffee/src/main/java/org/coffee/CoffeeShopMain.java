package org.coffee;

public class CoffeeShopMain {

    public static void main(String[] args) {
        // declaration
        BestCoffee c;

        // initialization
        c = new BestCoffee();


        c.setSize(CoffeeSize.EXTRA_LARGE);

        c.drink();

    }
}
