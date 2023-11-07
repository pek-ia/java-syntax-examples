package org.fungame;

import java.util.ArrayList;

public class Convoy {
    ArrayList<Vehicle> convoy = new ArrayList<>();

    public void addVehicle(Vehicle v){
        convoy.add(v);
    }

    public int hitCactus() {
        int result = 0;
        for (Vehicle v: convoy) {
            result += v.hitCactus();
        }
        return result;
    }
}
