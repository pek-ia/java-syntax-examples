package org.coffee;

public class BetterCoffee {


    // These are the variables you should use for size
    // I can't force you, though
    public static final String SMALL = "SMALL";
    public static final String MEDIUM = "MEDIUM";
    public static final String LARGE = "LARGE";
    public static final String EXTRA_LARGE = "EXTRA LARGE";


    String size = SMALL;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void drink() {
        // I have a string, but it could be anything?
        // Not really much better, is it?
        String s = size;


        System.out.println("Drinking my " + s + " coffee!");
    }


}
