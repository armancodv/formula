package com.armanco.formula.view.section;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.armanco.formula.data.models.Section;

import java.util.List;

public class SectionFragmentStatePagerAdapter extends FragmentStatePagerAdapter {

    private List<Section> sections;
    private Context context;

    public SectionFragmentStatePagerAdapter(@NonNull FragmentManager fm, List<Section> sections, Context context) {
        super(fm);
        this.sections = sections;
        this.context = context;
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
        return sections.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return context.getResources().getString(sections.get(position).nameId);
    }
}
