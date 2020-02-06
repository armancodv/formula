package com.armanco.formula.view.base;

public interface BasePresenter<V extends BaseView> {
    void onAttach(V view);
    void onViewCreated();
    void onDestroy();
}
