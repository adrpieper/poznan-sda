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
        binding.setUser(new User("Jan", "Kowalski"));
        binding.nextPersonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.setUser(new User("Adam", "Dominik"));
            }
        });
    }
}
