package com.armanco.formula.view.base;

import androidx.appcompat.app.AppCompatActivity;

import com.armanco.formula.di.DependencyInjector;
import com.armanco.formula.di.DependencyInjectorImpl;

public abstract class BaseActivity extends AppCompatActivity implements BaseContract.View {
    DependencyInjector dependencyInjector = new DependencyInjectorImpl();
    BaseContract.Presenter<BaseContract.View> presenter;

    @Override
    protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

}
