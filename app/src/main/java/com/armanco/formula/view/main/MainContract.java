package com.armanco.formula.view.main;

import com.armanco.formula.view.base.BasePresenter;
import com.armanco.formula.view.base.BaseView;

public interface MainContract {
    interface View extends BaseView {

    }
    interface Presenter extends BasePresenter<MainContract.View> {

    }
}
