package com.example.dagger.adrian.daggerexample.model;

import javax.inject.Inject;

/**
 * Created by Adrian on 2017-04-08.
 */

public class Population {

    private int count = 1000;

    @Inject
    public Population() {
    }

    public int countTaxes() {
        return count/10;
    }

    public int getCount() {
        return count;
    }
}
