package com.armanco.formula.data.repositories;

import com.armanco.formula.data.models.Formula;

import java.util.List;

public interface FormulaRepository {
    List<Formula> getAll();
}
