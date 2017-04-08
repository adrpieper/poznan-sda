package com.example.dagger.adrian.daggerexample.model;

/**
 * Created by Adrian on 2017-04-08.
 */

public class State {
    private final Economy economy;
    private int gold = 1000;

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
