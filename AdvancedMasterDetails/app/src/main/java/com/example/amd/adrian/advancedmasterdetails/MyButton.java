package com.example.amd.adrian.advancedmasterdetails;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Adrian on 2017-04-03.
 */

public class MyButton extends Button {
    public MyButton(Context context) {
        super(context);
        init();
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }


    private void init() {
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Hello World!", Toast.LENGTH_LONG).show();
            }
        });
    }

}
