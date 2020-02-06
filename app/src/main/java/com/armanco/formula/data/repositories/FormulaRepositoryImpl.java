package com.armanco.formula.data.repositories;

import com.armanco.formula.data.models.Formula;

import java.util.ArrayList;
import java.util.List;

public class FormulaRepositoryImpl implements FormulaRepository {

    @Override
    public List<Formula> getAll() {
        return new ArrayList<Formula>();
    }
}
