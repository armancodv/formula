package com.armanco.formula.view.main;

import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.armanco.formula.R;
import com.armanco.formula.data.models.Section;
import com.armanco.formula.view.base.BaseActivity;
import com.ramotion.cardslider.CardSliderLayoutManager;
import com.ramotion.cardslider.CardSnapHelper;

import java.util.List;

public class MainActivity extends BaseActivity implements MainContract.View {

    private MainPresenter presenter = new MainPresenter();
    private RecyclerView sectionsRecyclerView;
    private CardSliderLayoutManager sectionLayoutManager;
    private SectionAdapter sectionAdapter;
    private TextView titleTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sectionsRecyclerView = findViewById(R.id.main_sections_recycler_view);
        titleTv = findViewById(R.id.main_section_title);
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
        sectionLayoutManager = new CardSliderLayoutManager(this);
        sectionsRecyclerView.setLayoutManager(sectionLayoutManager);
        sectionAdapter = new SectionAdapter(sections, this, R.layout.item_section);
        sectionAdapter.setClickListener(presenter);
        sectionsRecyclerView.setAdapter(sectionAdapter);
        new CardSnapHelper().attachToRecyclerView(sectionsRecyclerView);
        sectionLayoutManager.getActiveCardPosition();
        sectionsRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                onSectionScrolled();
            }
        });
    }

    @Override
    public void onSectionScrolled() {
        int pos = sectionLayoutManager.getActiveCardPosition();
        if (pos != RecyclerView.NO_POSITION) {
            presenter.onSectionChanged(pos);
        }
    }

    @Override
    public void changeSectionData(Section section) {
        titleTv.setText(section.name);
    }
}
