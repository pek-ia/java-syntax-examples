package org.coffee;

import java.util.ArrayList;
import java.util.List;

/*
 *  The BEST Coffee is easy to drink, easy to read, easy to write,
 *  and hard to misuse.
 */
public class BestCoffee {

    CoffeeSize size = CoffeeSize.LARGE;

    List<Topping> toppings = new ArrayList<>();

    public void addTopping(Topping t){
        toppings.add(t);
    }

    public CoffeeSize getSize() {
        return size;
    }

    public void setSize(CoffeeSize size) {
        this.size = size;
    }

    public void drink(){
        System.out.println("Drinking my " + size + " coffee!!!");
        System.out.println(" which is " + size.getDescription());
        if (size == CoffeeSize.EXTRA_LARGE){
            System.out.println("That was really big!");
        }

        for (Topping t : toppings){
            System.out.println("with " + t);
        }
    }
}
