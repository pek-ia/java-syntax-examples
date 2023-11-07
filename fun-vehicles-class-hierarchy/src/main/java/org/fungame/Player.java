package org.fungame;

public class Player extends Damageable {

    public void fightOtherPlayer(Player other){
        other.setHitPoints(other.getHitPoints() - 5);
        setHitPoints(getHitPoints()-5);
    }

}
