package com.armanco.formula.view.section;

import com.armanco.formula.data.models.Formula;
import com.armanco.formula.data.repositories.FormulaRepository;
import com.armanco.formula.data.repositories.FormulaRepositoryImpl;
import com.armanco.formula.view.base.BasePresenter;

import java.util.List;

public class SectionPresenter extends BasePresenter<SectionContract.View> implements SectionContract.Presenter {
    private FormulaRepository formulaRepository = new FormulaRepositoryImpl();
    private List<Formula> formulas;

    @Override
    public void onViewCreated() {
        formulas = formulaRepository.getAll();
        view.showFormulas(formulas);
    }
}
