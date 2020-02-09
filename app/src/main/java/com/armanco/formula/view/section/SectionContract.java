package com.armanco.formula.view.section;

import com.armanco.formula.data.models.Section;
import com.armanco.formula.view.base.BaseContract;
import com.armanco.formula.view.main.MainContract;

import java.util.List;

public interface SectionContract extends BaseContract {
    interface View extends BaseContract.View {
    }
    interface Presenter extends BaseContract.Presenter<SectionContract.View> {
    }
}
