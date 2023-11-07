package org.fungame;

public class Moped extends Vehicle {
    @Override
    public int hitCactus() {
        int hitpoints = super.hitCactus();
        System.out.println("OOOOOOuch!  That really hurt!");
        int deduction = 29;
        setHitPoints(getHitPoints() - deduction);
        return getHitPoints();
    }
}
