package com.armanco.formula.view.base;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.armanco.formula.data.prefs.Preferences;
import com.armanco.formula.data.prefs.PreferencesImpl;
import com.armanco.formula.data.repositories.Repository;
import com.armanco.formula.data.repositories.RepositoryImpl;

public abstract class BaseActivity extends AppCompatActivity implements BaseContract.View {
    protected Preferences preferences;
    protected BaseFragment fragment;
    protected Repository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        preferences = new PreferencesImpl(this, "prefs");
        repository = new RepositoryImpl();
    }



    @Override
    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showActivity(Class activityClass) {
        showActivity(activityClass, null);
    }

    @Override
    public void showActivity(Class activityClass, Bundle bundle) {
        Intent myIntent = new Intent(this, activityClass);
        if(bundle!=null) myIntent.putExtras(bundle);
        startActivity(myIntent);
    }

    @Override
    public void setStatusBarColor(int color) {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(ContextCompat.getColor(window.getContext(), color));
        }
    }

    @Override
    public Preferences getPreferences() {
        return preferences;
    }

    @Override
    public void onBackPressed() {
        if(fragment!=null) fragment.onBackPressed();
        else showToast("Error");
    }

    @Override
    public Repository getRepository() {
        return repository;
    }
}
