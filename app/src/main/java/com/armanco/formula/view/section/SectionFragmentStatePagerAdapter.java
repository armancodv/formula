package com.armanco.formula.view.section;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class SectionFragmentStatePagerAdapter extends FragmentStatePagerAdapter {

    public SectionFragmentStatePagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position % 4) {
            //case 0:
            //    return RecyclerViewFragment.newInstance();
            //case 1:
            //    return RecyclerViewFragment.newInstance();
            //case 2:
            //    return WebViewFragment.newInstance();
            default:
                return new SectionFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position % 4) {
            case 0:
                return "Selection";
            case 1:
                return "Actualités";
            case 2:
                return "Professionnel";
            case 3:
                return "Divertissement";
        }
        return "";
    }
}
