package org.shapes;

public class Main {
    public static void main(String[] args) {
        Shape s = new Rectangle(3,4);
        s.draw();
        System.out.println(s.getArea());
    }
}
