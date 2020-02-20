package com.armanco.formula.view.main;

import android.os.Bundle;

import androidx.viewpager.widget.ViewPager;

import com.armanco.formula.R;
import com.armanco.formula.data.models.Section;
import com.armanco.formula.view.base.BaseActivity;
import com.github.florent37.materialviewpager.MaterialViewPager;
import com.github.florent37.materialviewpager.header.HeaderDesign;

import java.util.List;

public class MainActivity extends BaseActivity implements MainContract.View {

    private MainPresenter presenter = new MainPresenter();
    private MaterialViewPager materialViewPager;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        materialViewPager = findViewById(R.id.materialViewPager);

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
        viewPager = materialViewPager.getViewPager();
        viewPager.setAdapter(new SectionAdapter(getSupportFragmentManager(), sections, getApplicationContext()));
        materialViewPager.getPagerTitleStrip().setViewPager(materialViewPager.getViewPager());
        materialViewPager.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {
                setStatusBarColor(sections.get(page).colorId);
                return HeaderDesign.fromColorResAndUrl(sections.get(page).colorId, "");
            }
        });
    }
}
