package com.armanco.formula.view.base;

public abstract class BasePresenter<V extends BaseContract.View> implements BaseContract.Presenter<V> {
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
