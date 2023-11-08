package org.fungame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    public void hitCactusTest_deductsFromHitpoints(){
        Vehicle v = new Vehicle();
        int before = v.getHitPoints();
        v.hitCactus();
        int after = v.getHitPoints();
        assertTrue(after < before);

    }
    @Test
    public void hitCactusTest_Moped_deductsExtra29FromHitpoints(){
        Vehicle v = new Moped();
        int before = v.getHitPoints();
        v.hitCactus();
        int after = v.getHitPoints();
        assertTrue( before - after == 30);
    }


}