package org.example;

import java.util.Comparator;

/*
 *  This is a simple comparator that compares two donuts
 *  by seeing which one has more calories
 *
 *  Arrays.sort() and Collections.sort() can call this
 *  method repeatedly when trying to sort the donuts.
 */

public class CompareDonutsByCalories implements Comparator<Donut>
{
    // Sort by calories, ascending
    @Override
    public int compare(Donut donut1, Donut donut2) {
        if (donut1 == donut2) return 0;
        else return donut1.getCalories() - donut2.getCalories();
    }
}
