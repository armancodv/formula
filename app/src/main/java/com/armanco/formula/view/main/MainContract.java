package com.armanco.formula.view.main;

import com.armanco.formula.data.models.Section;
import com.armanco.formula.view.base.BaseContract;

import java.util.List;

public interface MainContract extends BaseContract {
    interface View extends BaseContract.View {
        void showSections(List<Section> sections);

    }
    interface Presenter extends BaseContract.Presenter<MainContract.View> {

    }
}
