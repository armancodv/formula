package com.armanco.formula.view.section;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.armanco.formula.R;
import com.armanco.formula.data.models.Section;
import com.armanco.formula.data.models.SubSection;
import com.armanco.formula.view.base.BaseActivity;
import com.armanco.formula.view.sub_section.SubSectionFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;
import com.ramotion.cardslider.CardSliderLayoutManager;
import com.ramotion.cardslider.CardSnapHelper;

import java.util.List;

public class SectionActivity extends BaseActivity implements SectionContract.View {

    private SectionPresenter presenter = new SectionPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section);

        presenter.onAttach(this);
        presenter.onViewCreated();
    }


    @Override
    protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void showViewPager(List<SubSection> subSections) {
        FragmentPagerItems.Creator creator = FragmentPagerItems.with(this);
        for (SubSection subSection : subSections) {
            creator.add(subSection.nameId, SubSectionFragment.class);
        }
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), creator.create());

        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);

        SmartTabLayout viewPagerTab = findViewById(R.id.viewpager_tab);
        viewPagerTab.setViewPager(viewPager);
    }
}
