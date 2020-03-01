package com.armanco.formula.view.sub_section;

import com.armanco.formula.data.models.SubSection;
import com.armanco.formula.view.base.BaseContract;

import java.util.List;

public interface SubSectionContract extends BaseContract {
    interface View extends BaseContract.View {
    }
    interface Presenter extends BaseContract.Presenter<SubSectionContract.View> {
    }
}
