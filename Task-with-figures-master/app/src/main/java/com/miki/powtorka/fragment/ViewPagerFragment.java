package com.miki.powtorka.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.miki.powtorka.R;

/**
 * Created by Adrian on 2017-04-04.
 */

public class ViewPagerFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        ViewPager viewPager = (ViewPager) inflater.inflate(R.layout.pager_titles, container, false);
        viewPager.setAdapter(new MyAdapter(getFragmentManager()));
        return viewPager;
    }

    private class MyAdapter extends FragmentPagerAdapter {

        public static final int NUMBER_OF_PAGES = 3;
        private final int[] names = {R.string.circle, R.string.rectangle, R.string.triangle};

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new FragmentCircle();
            }
            if (position == 1) {
                return new FragmentRectangle();
            }

            return new FragmentTriangle();
        }

        @Override
        public int getCount() {
            return NUMBER_OF_PAGES;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return getString(names[position]);
        }
    }
}
