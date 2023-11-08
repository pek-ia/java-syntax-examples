package org.fungame;

public class Player extends Damageable {

    /*
     * Players gain or lose hit points in many ways.
     *
     * For example, fighting with another player damages both of them.
     */
    public void fightOtherPlayer(Player other){
        other.setHitPoints(other.getHitPoints() - 5);
        this.setHitPoints(this.getHitPoints()-5);
    }

}
