package com.example.dagger.adrian.daggerexample;

import com.example.dagger.adrian.daggerexample.model.Army;
import com.example.dagger.adrian.daggerexample.model.Building;
import com.example.dagger.adrian.daggerexample.model.Economy;
import com.example.dagger.adrian.daggerexample.model.Population;
import com.example.dagger.adrian.daggerexample.model.State;

/**
 * Created by Adrian on 2017-04-08.
 */

public class DependencyResolver {

    public static State resolve() {
        Building building = new Building();
        Population population = new Population();
        Army army = new Army(population);
        Economy economy = new Economy(army, building, population);
        State state = new State(economy);
        return state;
    }
}
