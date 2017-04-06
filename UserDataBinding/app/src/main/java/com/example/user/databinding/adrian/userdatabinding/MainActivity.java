package com.example.user.databinding.adrian.userdatabinding;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.example.user.databinding.adrian.userdatabinding.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        final User user = new User("Jan", "Kowalski");
        binding.setUser(user);
        binding.nextPersonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.setFirstName("Adam");
                user.setLastName("Dominik");
            }
        });
    }
}
