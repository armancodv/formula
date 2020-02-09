package com.armanco.formula.view.base;

public interface BaseContract {
    interface View {
        void showToast(String message);
        void setStatusBarColor(int color);
    }

    interface Presenter<V extends BaseContract.View> {
        void onAttach(V view);
        void onViewCreated();
        void onDestroy();
    }

}
