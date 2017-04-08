package com.example.dagger.adrian.daggerexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dagger.adrian.daggerexample.model.State;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button calculateButton = (Button) findViewById(R.id.calculateButton);
        final TextView goldTextView = (TextView) findViewById(R.id.goldTextView);

        final State state = DependencyResolver.resolve();
        goldTextView.setText(String.valueOf(state.getGold()));

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                state.countBalance();
                goldTextView.setText(String.valueOf(state.getGold()));
            }
        });
    }
}
