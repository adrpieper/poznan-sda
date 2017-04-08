package com.example.tax.databinding.adrian.taxform;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Adrian on 2017-04-06.
 */

public class TaxModel extends BaseObservable {

    private double amount;
    private double taxPercentage;
    private double freeAmount;

    public void setAmount(double amount) {
        this.amount = amount;
        notifyPropertyChanged(BR._all);
    }

    public void setFreeAmount(double freeAmount) {
        this.freeAmount = freeAmount;
        notifyPropertyChanged(BR._all);
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
        notifyPropertyChanged(BR._all);
    }

    @Bindable
    public double getTaxAmount() {
        return (amount-freeAmount)*taxPercentage*0.01;
    }

    @Bindable
    public double getNetAmount() {
        return amount - getTaxAmount();
    }

}
