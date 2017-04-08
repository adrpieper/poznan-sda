package com.example.dagger.adrian.daggerexample.model;

import javax.inject.Inject;

/**
 * Created by Adrian on 2017-04-08.
 */

public class Building {

    @Inject
    public Building() {
    }

    public int countCost() {
        return 100;
    }

    public int countProduction() {
        return 1000;
    }
}
