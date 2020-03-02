package com.armanco.formula.view.sub_section;

import com.armanco.formula.data.models.Formula;
import com.armanco.formula.view.base.BaseContract;

import java.util.List;

public interface SubSectionContract extends BaseContract {
    interface View extends BaseContract.View {
        void showRecycler(List<Formula> formulas);
    }
    interface Presenter extends BaseContract.Presenter<SubSectionContract.View> {
        void setPosition(int sectionPosition, int subSectionPosition);
        void getData();
    }
}
