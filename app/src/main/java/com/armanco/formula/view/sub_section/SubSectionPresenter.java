package com.armanco.formula.view.sub_section;

import android.util.Log;

import com.armanco.formula.data.models.Formula;
import com.armanco.formula.view.base.BasePresenter;

import java.util.ArrayList;
import java.util.List;

public class SubSectionPresenter extends BasePresenter<SubSectionContract.View> implements SubSectionContract.Presenter {

    private int sectionPosition;
    private int subSectionPosition;
    private List<Formula> formulas;

    @Override
    public void onViewCreated() {
        super.onViewCreated();
    }

    @Override
    public void setPosition(int sectionPosition, int subSectionPosition) {
        this.sectionPosition = sectionPosition;
        this.subSectionPosition = subSectionPosition;
        getData();
    }

    @Override
    public void getData() {
        formulas = repository.getAllFormulasByPosition(sectionPosition, subSectionPosition);
        Log.d("TESTTEST", formulas.size()+"");
        view.showRecycler(formulas);
    }
}
