package com.armanco.formula.view.main;

import android.view.View;

import com.armanco.formula.data.models.Section;
import com.armanco.formula.data.repositories.SectionRepository;
import com.armanco.formula.data.repositories.SectionRepositoryImpl;
import com.armanco.formula.utils.Listener;
import com.armanco.formula.view.base.BasePresenter;

import java.util.List;

public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter, Listener.SectionClickListener {

    private SectionRepository sectionRepository = new SectionRepositoryImpl();

    @Override
    public void onViewCreated() {
        List<Section> sections = sectionRepository.getAll();
        view.showSections(sections);

    }

    @Override
    public void onSectionClick(View view, int position, Section section) {

    }

}
