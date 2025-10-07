package org.example;

/*
 *  The class Donut is a data type that represents a
 *    tasty snack in the real world
 */

public class Donut {

    /*
     * Methods and variables may be declared inside a class definition
     *    They are called "members" of the class
     *
     * Non-static variables are called "fields" or "instance variables"
     *    Each separate instance of the Donut class gets its own copy
     *    of these variables
     *
     * Fields are shared by all non-static methods
     *
     * Usually, fields are declared as private, so cannot be seen
     *    by other classes
     */
    private int calories;
    private double price;
    private boolean hasSprinkles;
    private String name;
    private String description;

    /*
     *  CONSTRUCTOR
     *
     *  The constructor is a special method that initializes
     *     the fields in a new object
     */
    public Donut(int calories, double price, boolean hasSprinkles, String name, String description) {
        this.calories = calories;
        this.price = price;
        this.hasSprinkles = hasSprinkles;
        this.name = name;
        this.description = description;
    }

    /*
     *  SETTERS AND GETTERS
     *
     *  These methods grant selective read/write access to other classes
     */

    public int getCalories() {
        return calories;
    }

    private void setCalories(int calories){
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getHasSprinkles() {
        return hasSprinkles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    /*
     * This method returns a computed value
     */
    public double getPricePerCalorie(){
        return price / calories;
    }


    /*
     * This toString method overrides the automatically provided one
     */
    @Override
    public String toString() {
        return "Donut{" +
                "calories=" + calories +
                ", price=" + price +
                ", hasSprinkles=" + hasSprinkles +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
