package com.example.dagger.adrian.daggerexample.model;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Adrian on 2017-04-08.
 */

@Singleton
public class State {
    private final Economy economy;
    private int gold = 1000;

    @Inject
    public State(Economy economy) {
        this.economy = economy;
    }

    public void countBalance(){
        gold -= economy.countCost();
        gold += economy.countGain();
    }

    public int getGold() {
        return gold;
    }
}
