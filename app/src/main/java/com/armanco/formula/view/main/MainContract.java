package com.armanco.formula.view.main;

import com.armanco.formula.data.models.Section;
import com.armanco.formula.view.base.BasePresenter;
import com.armanco.formula.view.base.BaseView;

import java.util.List;

public interface MainContract {
    interface View extends BaseView {
        void showSections(List<Section> sections);

    }
    interface Presenter extends BasePresenter<MainContract.View> {

    }
}
