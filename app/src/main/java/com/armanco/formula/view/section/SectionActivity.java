package com.armanco.formula.view.section;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.armanco.formula.R;
import com.armanco.formula.data.models.Formula;
import com.armanco.formula.view.base.BaseActivity;
import com.github.florent37.materialviewpager.MaterialViewPager;

import java.util.List;

public class SectionActivity extends BaseActivity implements SectionContract.View {

    private SectionPresenter presenter = new SectionPresenter();
    private MaterialViewPager materialViewPager;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section);

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
    public void showFormulas(List<Formula> formulas) {
        viewPager = materialViewPager.getViewPager();
        viewPager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return 0;
            }

            @Override
            public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
                return false;
            }
        });
        materialViewPager.getPagerTitleStrip().setViewPager(materialViewPager.getViewPager());

    }
}
