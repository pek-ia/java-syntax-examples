package org.fungame;

public class Vehicle extends Damageable {

    // Some attributes appropriate for a vehicle.  These
    // need a lot more study
    // TODO - define how speed and capacity might be affected by damage.

    double maxSpeed;
    int passengerCapacity;

    /*
     * Vehicles may gain or lose hit points by hitting
     * a hazard or a power-up
     *
     * For example, running into a cactus damages most
     * vehicles.  Don't ask me how I know. -pk
     */

    public int hitCactus(){
        System.out.println("Vehicle hit a cactus");
        return --hitPoints;
    }
}
