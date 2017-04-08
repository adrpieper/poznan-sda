package com.example.dagger.adrian.daggerexample.model;

/**
 * Created by Adrian on 2017-04-08.
 */

public class Army {
    private final Population population;
    private final static int COST_PER_SOLDIER = 2;
    private final static double PERCENT_OF_ACTIVE_SOLDIERS = 0.1;

    public Army(Population population) {
        this.population = population;
    }


    public int countCost() {
        return (int) (COST_PER_SOLDIER * PERCENT_OF_ACTIVE_SOLDIERS * population.getCount());
    }
}
