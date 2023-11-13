package org.coffee;

public class CoffeeShopMain {

    public static void main(String[] args) {
        // declaration
        BestCoffee c;

        // initialization
        c = new BestCoffee();


        c.setSize(CoffeeSize.EXTRA_LARGE);
        c.addTopping(Topping.CINNAMON);
        c.addTopping(Topping.WHIPPED_CREAM);
        c.addTopping(Topping.UNICORN_FUR);

        c.drink();

    }
}
