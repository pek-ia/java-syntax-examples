package org.coffee;

// These are the values you should use for size
// And the compiler enforces it!!

public enum CoffeeSize {
    SMALL("a tiny little cup, just a taste", 8),
    MEDIUM("a cup that might wake you up a little", 12),
    LARGE("a robust energy beverage", 16),
    EXTRA_LARGE("an extreme jolt just for coders", 24);

    private String description;
    private int ounces;
    CoffeeSize(String description, int ounces){
        this.description = description;
        this.ounces = ounces;
    }

    public String getDescription() {
        return description;
    }

    public int getOunces() {
        return ounces;
    }
}
