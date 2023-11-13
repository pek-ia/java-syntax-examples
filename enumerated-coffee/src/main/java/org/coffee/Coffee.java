package org.coffee;


public class Coffee {

    // These are the variables you should use for size
    // I can't force you, though...
    public static final int SMALL = 0;
    public static final int MEDIUM = 1;
    public static final int LARGE = 2;
    public static final int EXTRA_LARGE = 14;


    int size = SMALL;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void drink() {
        // I have an integer; I WANT a String
        String s;

        if (size == SMALL) {
            s = "SMALL";
        } else if (size == MEDIUM) {
            s = "MEDIUM";
        } else if (size == LARGE) {
            s = "LARGE";
        } else if (size == EXTRA_LARGE) {
            s = "EXTRA LARGE";
        } else {
            s = "Default size";
        }

        System.out.println("Drinking my " + s + " coffee!");
    }
}
