package com.armanco.formula.view.main;

import com.armanco.formula.data.models.Section;
import com.armanco.formula.data.repositories.SectionRepository;
import com.armanco.formula.data.repositories.SectionRepositoryImpl;

import java.util.List;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View view;
    private SectionRepository sectionRepository = new SectionRepositoryImpl();
    @Override
    public void onAttach(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void onViewCreated() {
        List<Section> sections = sectionRepository.getAll();
        view.showSections(sections);

    }

    @Override
    public void onDestroy() {
        this.view = null;
    }

}
