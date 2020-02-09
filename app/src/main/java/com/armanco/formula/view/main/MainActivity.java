package com.armanco.formula.view.main;

import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.armanco.formula.R;
import com.armanco.formula.data.models.Section;
import com.armanco.formula.view.base.BaseActivity;
import com.ramotion.cardslider.CardSliderLayoutManager;
import com.ramotion.cardslider.CardSnapHelper;

import java.util.List;

public class MainActivity extends BaseActivity implements MainContract.View {

    private MainPresenter presenter = new MainPresenter();
    private RecyclerView sectionsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sectionsRecyclerView = findViewById(R.id.main_sections_recycler_view);
        presenter.onAttach(this);
        presenter.onViewCreated();
    }


    @Override
    protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }


    @Override
    public void showSections(List<Section> sections) {
        final CardSliderLayoutManager layoutManager = new CardSliderLayoutManager(this);
        sectionsRecyclerView.setLayoutManager(layoutManager);
        final SectionAdapter sectionAdapter = new SectionAdapter(sections, this, R.layout.item_section);
        sectionAdapter.setClickListener(presenter);
        sectionsRecyclerView.setAdapter(sectionAdapter);
        new CardSnapHelper().attachToRecyclerView(sectionsRecyclerView);
    }
}
