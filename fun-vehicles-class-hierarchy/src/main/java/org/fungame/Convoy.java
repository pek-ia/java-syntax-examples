package org.fungame;

import java.util.ArrayList;

public class Convoy {
    ArrayList<Vehicle> convoy = new ArrayList<>();

    public void addVehicle(Vehicle v){
        convoy.add(v);
    }

    /*
     * A Convoy is a group of vehicles that may travel together
     *
     * A convoy may encounter a hazard that affects the health of
     * all the vehicles in the convoy.
     *
     */
    public int hitCactus() {
        int result = 0;
        for (Vehicle v: convoy) {
            result += v.hitCactus();
        }
        return result;
    }
}
