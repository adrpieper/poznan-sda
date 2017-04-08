package com.example.dagger.adrian.daggerexample.model;

import javax.inject.Inject;

/**
 * Created by Adrian on 2017-04-08.
 */

public class Economy {
    private final Army army;
    private final Building building;
    private final Population population;

    @Inject
    public Economy(Army army, Building building, Population population) {
        this.army = army;
        this.building = building;
        this.population = population;
    }

    public int countCost() {
        return army.countCost()+building.countCost();
    }

    public int countGain() {
        return building.countProduction() + population.countTaxes();
    }
}
