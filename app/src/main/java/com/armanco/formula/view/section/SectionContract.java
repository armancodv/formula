package com.armanco.formula.view.section;

import com.armanco.formula.data.models.Formula;
import com.armanco.formula.data.models.Section;
import com.armanco.formula.view.base.BaseContract;

import java.util.List;

public interface SectionContract extends BaseContract {
    interface View extends BaseContract.View {
        void showPager(List<Section> sections);
    }
    interface Presenter extends BaseContract.Presenter<SectionContract.View> {
    }
}
