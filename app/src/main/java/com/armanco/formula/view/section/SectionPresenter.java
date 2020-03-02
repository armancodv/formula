package com.armanco.formula.view.section;

import com.armanco.formula.R;
import com.armanco.formula.data.models.SubSection;
import com.armanco.formula.view.base.BasePresenter;

import java.util.List;

public class SectionPresenter extends BasePresenter<SectionContract.View> implements SectionContract.Presenter {

    private List<SubSection> subSections;
    private int sectionPosition;
    @Override
    public void onViewCreated() {
        super.onViewCreated();
        subSections = repository.getAllSubSections(R.string.integral_title);
        view.showViewPager(subSections);
    }

    @Override
    public int getSectionPosition() {
        return sectionPosition;
    }

    @Override
    public void setSectionPosition(int sectionPosition) {
        this.sectionPosition = sectionPosition;
    }
}
