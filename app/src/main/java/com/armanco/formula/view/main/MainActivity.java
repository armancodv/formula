package com.armanco.formula.view.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.armanco.formula.R;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainPresenter presenter = new MainPresenter();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }
}
