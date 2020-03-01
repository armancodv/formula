package com.armanco.formula.view.base;

import com.armanco.formula.view.main.MainContract;

public abstract class BasePresenter<V extends MainContract.View> implements BaseContract.Presenter<V> {
    protected V view;
    @Override
    public void onAttach(V view) {
        this.view = view;
    }

    @Override
    public void onDestroy() {
        this.view = null;
    }

}
