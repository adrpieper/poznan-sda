package com.example.tax.databinding.adrian.taxform;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.example.tax.databinding.adrian.taxform.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private TaxModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        model = new TaxModel();
        binding.setModel(model);
        binding.freeAmountEditText.addTextChangedListener(new TextWatcherAdapter() {
            @Override
            public void afterTextChanged(Editable editable) {
                model.setFreeAmount(parseField(editable));
            }
        });

        binding.amountEditText.addTextChangedListener(new TextWatcherAdapter() {
            @Override
            public void afterTextChanged(Editable editable) {
                model.setAmount(parseField(editable));
            }
        });

        binding.taxPercentageEditText.addTextChangedListener(new TextWatcherAdapter() {

            @Override
            public void afterTextChanged(Editable editable) {
                model.setTaxPercentage(parseField(editable));
            }
        });

    }

    private double parseField(Editable editable) {
        try {
            return Double.parseDouble(editable.toString());
        }catch (NumberFormatException e) {
            return 0;
        }
    }


}
