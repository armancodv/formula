package com.armanco.formula.view.main;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View view;
    @Override
    public void onAttach(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void onViewCreated() {

    }

    @Override
    public void onDestroy() {
        this.view = null;
    }
}
