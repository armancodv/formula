package com.armanco.formula.view.section;

import com.armanco.formula.R;
import com.armanco.formula.data.models.SubSection;
import com.armanco.formula.view.base.BasePresenter;

import java.util.List;

public class SectionPresenter extends BasePresenter<SectionContract.View> implements SectionContract.Presenter {

    List<SubSection> subSections;
    @Override
    public void onViewCreated() {
        super.onViewCreated();
        subSections = repository.getAllSubSections(R.string.integral_title);
        view.showViewPager(subSections);
    }
}
