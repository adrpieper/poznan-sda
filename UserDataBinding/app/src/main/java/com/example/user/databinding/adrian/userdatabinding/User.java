package com.example.user.databinding.adrian.userdatabinding;

/**
 * Created by Adrian on 2017-04-06.
 */

public class User {

    private final String firstName;
    private final String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
