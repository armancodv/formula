package com.armanco.formula.view.base;

import com.armanco.formula.data.prefs.Preferences;
import com.armanco.formula.data.repositories.Repository;
public interface BaseContract {
    interface View {
        void showToast(String message);
        void showActivity(Class activityClass);
        void setStatusBarColor(int color);
        Preferences getPreferences();
        public Repository getRepository();

    }

    interface Presenter<V extends BaseContract.View> {
        void onAttach(V view);
        void onViewCreated();
        void onDestroy();
    }

}
