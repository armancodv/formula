package com.armanco.formula.di;

import com.armanco.formula.data.repositories.FormulaRepository;
import com.armanco.formula.data.repositories.FormulaRepositoryImpl;
import com.armanco.formula.data.repositories.SectionRepository;
import com.armanco.formula.data.repositories.SectionRepositoryImpl;

public class DependencyInjectorImpl implements DependencyInjector {
    @Override
    public SectionRepository sectionRepository() {
        return new SectionRepositoryImpl();
    }

    @Override
    public FormulaRepository formulaRepository() {
        return new FormulaRepositoryImpl();
    }
}
