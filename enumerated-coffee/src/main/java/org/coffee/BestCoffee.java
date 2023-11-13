package org.coffee;

/*
 *  The BEST Coffee is easy to drink, easy to read, easy to write,
 *  and hard to misuse.
 */
public class BestCoffee {

    CoffeeSize size = CoffeeSize.LARGE;

    public CoffeeSize getSize() {
        return size;
    }

    public void setSize(CoffeeSize size) {
        this.size = size;
    }

    public void drink(){
        System.out.println("Drinking my " + size + " coffee!!!");
    }
}
