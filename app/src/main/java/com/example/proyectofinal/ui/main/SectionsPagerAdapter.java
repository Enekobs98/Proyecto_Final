package com.example.proyectofinal.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.proyectofinal.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.Clasificación, R.string.Estadisticas, R.string.Equipos};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return PlaceholderFragment.newInstance(position + 1);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String section = null;

        switch (position) {
            case 0:
                section = mContext.getResources().getString(TAB_TITLES[position]);
                break;
            case 1:
                section = mContext.getResources().getString(TAB_TITLES[position]);
                break;
            case 2:
                section = mContext.getResources().getString(TAB_TITLES[position]);
                break;
        }
        return section;
    }

    @Override
    public int getCount() {
        return 3;
    }
}