package com.armanco.formula.view.base;

import com.armanco.formula.data.prefs.Preferences;
import com.armanco.formula.data.repositories.Repository;

public abstract class BasePresenter<V extends BaseContract.View> implements BaseContract.Presenter<V> {
    protected V view;
    protected Preferences preferences;
    protected Repository repository;

    public BasePresenter() {
    }


    @Override
    public void onAttach(V view) {
        this.view = view;
        preferences = view.getPreferences();
    }

    @Override
    public void onViewCreated() {
        repository = view.getRepository();
    }

    @Override
    public void onDestroy() {
        this.view = null;
    }


}
