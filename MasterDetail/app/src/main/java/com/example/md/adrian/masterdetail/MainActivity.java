package com.example.md.adrian.masterdetail;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void showBasicData() {
        DetailFragment detailFragment = getDetailFragment();
        if (detailFragment != null && detailFragment.isInLayout()) {
            detailFragment.showBasicData();
        }
        else {
            //Uruchamiał nową aktywność
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra("nazwa", 1);
            startActivity(intent);
        }
    }

    public void showDetailsData() {
        DetailFragment detailFragment = getDetailFragment();
        detailFragment.showDetailsData();
    }

    private DetailFragment getDetailFragment() {
        FragmentManager fm = getFragmentManager();
        return (DetailFragment) fm.findFragmentById(R.id.detailFragment);
    }
}
