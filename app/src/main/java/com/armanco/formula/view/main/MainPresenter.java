package com.armanco.formula.view.main;

import com.armanco.formula.data.models.Formula;
import com.armanco.formula.data.models.Section;
import com.armanco.formula.data.repositories.FormulaRepository;
import com.armanco.formula.data.repositories.FormulaRepositoryImpl;
import com.armanco.formula.data.repositories.SectionRepository;
import com.armanco.formula.data.repositories.SectionRepositoryImpl;
import com.armanco.formula.view.base.BasePresenter;

import java.util.List;

public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {
    private FormulaRepository formulaRepository = new FormulaRepositoryImpl();
    private SectionRepository sectionRepository = new SectionRepositoryImpl();
    private List<Formula> formulas;
    private List<Section> sections;

    @Override
    public void onViewCreated() {
        sections = sectionRepository.getAll();
        view.showPager(sections);
    }
}
