package com.armanco.formula.view.base;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.armanco.formula.data.prefs.Preferences;
import com.armanco.formula.data.repositories.Repository;

public abstract class BaseFragment extends Fragment implements BaseContract.View, View.OnClickListener {
    protected BaseActivity activity;
    public Preferences preferences;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        preferences = activity.getPreferences();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.activity = (BaseActivity) context;
    }

    @Override
    public void showToast(String message) {
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showActivity(Class activityClass) {
        activity.showActivity(activityClass);
    }

    @Override
    public void showActivity(Class activityClass, Bundle bundle) {
        activity.showActivity(activityClass, bundle);
    }

    @Override
    public void setStatusBarColor(int color) {
        activity.setStatusBarColor(color);
    }

    @Override
    public Preferences getPreferences() {
        return preferences;
    }

    public void onBackPressed() {

    }

    @Override
    public Repository getRepository() {
        return activity.getRepository();
    }

    @Override
    public void onClick(View v) {

    }
}
