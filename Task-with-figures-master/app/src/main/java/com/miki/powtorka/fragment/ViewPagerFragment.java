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

/**
 * Created by Adrian on 2017-04-04.
 */

public class ViewPagerFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        // () -> new FragmentTriangle()
        ViewPager viewPager = new ViewPager(getContext());
        viewPager.setAdapter(
                new MyAdapter(
                        getFragmentManager(),
                        FragmentTriangle.class,
                        FragmentCircle.class,
                        FragmentRectangle.class
                ));

        return viewPager;
    }

    private class MyAdapter extends FragmentPagerAdapter {

        public final Class<? extends Fragment>[] factories;

        public MyAdapter(FragmentManager fm, Class<? extends Fragment>... factories) {
            super(fm);
            this.factories = factories;
        }

        @Override
        public Fragment getItem(int position) {
            try {
                return factories[position].newInstance();
            } catch (java.lang.InstantiationException e) {
                return null;
            } catch (IllegalAccessException e) {
                return null;
            }
        }

        @Override
        public int getCount() {
            return factories.length;
        }
    }

    public interface FragmentFactory {
        Fragment create();
    }
}
