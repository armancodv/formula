package com.armanco.formula.view.main;

import com.armanco.formula.data.models.Section;
import com.armanco.formula.data.repositories.Repository;
import com.armanco.formula.data.repositories.RepositoryImpl;
import com.armanco.formula.utils.Listener;
import com.armanco.formula.view.base.BasePresenter;

import java.util.List;

public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter, Listener.SectionClickListener {

    private List<Section> sections;
    private Section selectedSection;
    public int sectionPosition;

    @Override
    public void onViewCreated() {
        super.onViewCreated();
        sections = repository.getAllSections();
        view.showSections(sections);
        selectedSection = sections.get(0);
        view.changeSectionData(selectedSection);
    }

    @Override
    public void onSectionClick(int position) {
        Section section = sections.get(position);
    }

    @Override
    public void onSectionChanged(int position) {
        Section section = sections.get(position);
        if(!section.equals(selectedSection)) {
            view.changeSectionData(section);
            selectedSection = section;
            sectionPosition = position;
        }
    }
}
