package com.armanco.formula.view.section;

import com.armanco.formula.data.models.Formula;
import com.armanco.formula.view.base.BaseContract;

import java.util.List;

public interface SectionContract extends BaseContract {
    interface View extends BaseContract.View {
        void showFormulas(List<Formula> formulas);
    }
    interface Presenter extends BaseContract.Presenter<SectionContract.View> {
    }
}
