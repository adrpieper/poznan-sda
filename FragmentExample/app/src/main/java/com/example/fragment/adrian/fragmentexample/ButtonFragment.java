package com.example.fragment.adrian.fragmentexample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Adrian on 2017-03-27.
 */

public class ButtonFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Button button = new Button(getActivity());
        button.setText("OK");
        return button;
    }
}
