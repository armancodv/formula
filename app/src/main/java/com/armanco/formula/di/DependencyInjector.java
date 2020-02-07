package com.armanco.formula.di;

import com.armanco.formula.data.repositories.FormulaRepository;
import com.armanco.formula.data.repositories.SectionRepository;
import com.armanco.formula.data.repositories.SectionRepositoryImpl;

public interface DependencyInjector {
    SectionRepository sectionRepository();
    FormulaRepository formulaRepository();
}
