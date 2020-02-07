package com.armanco.formula.view.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.armanco.formula.R;
import com.armanco.formula.data.models.Section;
import com.armanco.formula.view.base.BaseActivity;

import java.util.List;

public class MainActivity extends BaseActivity implements MainContract.View, SectionAdapter.ItemClickListener {

    private MainPresenter presenter = new MainPresenter();
    private RecyclerView sectionsRecyclerView;
    private SectionAdapter sectionAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sectionsRecyclerView = findViewById(R.id.main_sections_recycler_view);
        presenter.onAttach(this);
        presenter.onViewCreated();
    }

    @Override
    public void showSections(List<Section> sections) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        sectionsRecyclerView.setLayoutManager(layoutManager);
        sectionAdapter = new SectionAdapter(sections, this);
        sectionAdapter.setClickListener(this);
        sectionsRecyclerView.setAdapter(sectionAdapter);
    }

    @Override
    public void onSectionClick(View view, int position, Section section) {

    }
}
