package com.armanco.formula.view.main;

import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
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
    private TextView titleTv, descriptionTv;
    private RelativeLayout mainRl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sectionsRecyclerView = findViewById(R.id.main_sections_recycler_view);
        titleTv = findViewById(R.id.main_section_title);
        descriptionTv = findViewById(R.id.main_section_description);
        mainRl = findViewById(R.id.main);
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
        int position = sectionLayoutManager.getActiveCardPosition();
        if (position != RecyclerView.NO_POSITION) {
            presenter.onSectionChanged(position);
        }
    }

    @Override
    public void changeSectionData(Section section) {
        titleTv.setText(getString(section.nameId));
        descriptionTv.setText(getString(section.descriptionId));
        mainRl.setBackgroundColor(Color.parseColor(getString(section.colorId)));
        setStatusBarColor(section.colorId);
    }
}
