package com.armanco.formula.data.repositories;

import com.armanco.formula.data.models.Formula;
import com.armanco.formula.data.models.Section;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormulaRepositoryImpl implements FormulaRepository {

    @Override
    public List<Formula> getAll() {
        return Arrays.asList(
                new Formula(),
                new Formula()
        );
    }
}
