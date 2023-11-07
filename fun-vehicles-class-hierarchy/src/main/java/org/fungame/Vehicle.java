package org.fungame;

public class Vehicle extends Damageable {

    public int hitCactus(){
        System.out.println("Vehicle hit a cactus");
        return --hitPoints;
    }
}
