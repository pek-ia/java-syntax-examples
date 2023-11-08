package org.fungame;

public class Hovercraft extends Vehicle {

    /*
     * A Hovercraft floats on a cushion of air.
     *
     * A cactus is too
     * close to the ground to hurt it.  In fact, it's kind of fun to
     * run over a cactus in a Hovercraft.
     */

    @Override
    public int hitCactus() {
        System.out.println("Oh man, we mashed that cactus!  That was fun!!!");
        return super.hitCactus();
    }
}
