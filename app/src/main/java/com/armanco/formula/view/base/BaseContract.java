package com.armanco.formula.view.base;

public interface BaseContract {
    interface View {
    }

    interface Presenter<V extends BaseContract.View> {
        void onAttach(V view);
        void onViewCreated();
        void onDestroy();
    }

}
