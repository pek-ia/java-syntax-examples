package org.shapes;

public class Rectangle extends Shape {

    // instance variables are set to 0 by default
    // so we have a constructor to take care of that

    public Rectangle( double width, double height ){
        this.width = width;
        this.height = height;
    }

    double width = 1;
    double height = 2;

    @Override
    public void draw() {
        // super.draw();
        System.out.println("I am a Rectangle!");
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
