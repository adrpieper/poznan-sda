package com.example.dagger.adrian.daggerexample.dagger;

import com.example.dagger.adrian.daggerexample.model.Population;
import com.example.dagger.adrian.daggerexample.model.State;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Adrian on 2017-04-08.
 */
@Component
@Singleton
public interface StateComponent {
    State state();
    Population population();
}
