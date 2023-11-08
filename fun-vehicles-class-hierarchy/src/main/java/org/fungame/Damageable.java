package org.fungame;

/*
 * Damageable
 *
 * Everything in this game can take damage from hazards.
 *
 * That includes players, vehicles, and NPCs
 *
 * Every "damageable" object starts with 100 "hit points"
 * which represent its current strength.  If the hit points
 * for any object fall to zero, it is destroyed.
 */
public class Damageable {

    int hitPoints = 100;

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

}
