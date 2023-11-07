package org.fungame;

public class Hovercraft extends Vehicle {


    @Override
    public int hitCactus() {
        System.out.println("Oh man, we mashed that cactus!  That was fun!!!");
        return super.hitCactus();
    }
}
