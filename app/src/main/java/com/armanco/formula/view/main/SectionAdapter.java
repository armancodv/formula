package com.armanco.formula.view.main;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.armanco.formula.data.models.Section;
import com.armanco.formula.view.section.SectionFragment;

import java.util.List;

public class SectionAdapter extends FragmentStatePagerAdapter {

    private List<Section> sections;
    private Context context;

    public SectionAdapter(@NonNull FragmentManager fm, List<Section> sections, Context context) {
        super(fm);
        this.sections = sections;
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return new SectionFragment();
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
