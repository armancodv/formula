package com.armanco.formula.view.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.armanco.formula.R;
import com.armanco.formula.data.models.Section;

import java.util.List;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity implements MainContract.View, SectionAdapter.ItemClickListener {

    private MainPresenter presenter = new MainPresenter();
    private RecyclerView sectionRecyclerView;
    private SectionAdapter sectionAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        sectionRecyclerView.setLayoutManager(layoutManager);
        sectionAdapter = new SectionAdapter(sections, this);
        sectionAdapter.setClickListener(this);
        sectionRecyclerView.setAdapter(sectionAdapter);
    }

    @Override
    public void onSectionClick(View view, int position, Section section) {

    }
}
