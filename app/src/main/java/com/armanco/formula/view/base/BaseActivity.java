package com.armanco.formula.view.base;

import androidx.appcompat.app.AppCompatActivity;

import com.armanco.formula.di.DependencyInjector;
import com.armanco.formula.di.DependencyInjectorImpl;

public abstract class BaseActivity extends AppCompatActivity implements BaseView {
    DependencyInjector dependencyInjector = new DependencyInjectorImpl();
    BasePresenter<BaseView> presenter;

    @Override
    protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

}
