package com.armanco.formula.view.main;

import android.os.Bundle;
<<<<<<< HEAD
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.viewpager.widget.ViewPager;
=======
import android.widget.RelativeLayout;
import android.widget.TextView;
>>>>>>> parent of e2cfeba... SectionActivity added

import com.armanco.formula.R;
import com.armanco.formula.data.models.Section;
import com.armanco.formula.view.base.BaseActivity;
import com.armanco.formula.view.section.SectionFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import java.util.List;

public class MainActivity extends BaseActivity implements MainContract.View {

    private MainPresenter presenter = new MainPresenter();
    private ViewPager viewPager;

    private TextView headerTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD

=======
        sectionsRecyclerView = findViewById(R.id.main_sections_recycler_view);
        titleTv = findViewById(R.id.main_section_title);
        descriptionTv = findViewById(R.id.main_section_description);
        mainRl = findViewById(R.id.main);
>>>>>>> parent of e2cfeba... SectionActivity added
        presenter.onAttach(this);
        presenter.onViewCreated();
    }


    @Override
    protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void showPager(final List<Section> sections) {

        FragmentPagerItems.Creator creator = FragmentPagerItems.with(this);
        for(Section section : sections) {
            creator.add(section.nameId, SectionFragment.class);
        }
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), creator.create());

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(adapter);

        SmartTabLayout viewPagerTab = findViewById(R.id.view_pager_tab);
        viewPagerTab.setViewPager(viewPager);
    }
}
