package org.fungame;

public class Moped extends Vehicle {

    /*
     * A Moped is a vehicle that is very vulnerable to cactus!
     *
     * Please don't crash a cactus on your moped!!
     */

    @Override
    public int hitCactus() {
        // Accumulate superclass damage
        int hitpoints = super.hitCactus();

        // Even more damage because we are Moped!
        hitpoints = hitpoints -= 29;

        // Use public method to save new value
        setHitPoints(hitpoints);

        System.out.println("OOOOOOuch!  That really hurt!");
        return hitpoints;
    }
}
