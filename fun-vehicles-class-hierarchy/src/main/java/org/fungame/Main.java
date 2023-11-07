package org.fungame;

public class Main {

    public static void main(String[] args) {

        Player p = new Player();
        Player p1 = new Player();
        p.fightOtherPlayer(p1);
        System.out.println(p.getHitPoints());
        System.out.println(p1.getHitPoints());


        Convoy convoy = new Convoy();

        convoy.addVehicle(new Vehicle());
        convoy.addVehicle(new Hovercraft());
        convoy.addVehicle(new Moped());
        convoy.addVehicle(new Moped());

        int points = convoy.hitCactus();
        System.out.println(points);

    }

}
