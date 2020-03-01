package com.armanco.formula.data.models;

import java.util.List;

public class SubSection {
    public int nameId;
    public List<Formula> formulas;

    public SubSection(int nameId, List<Formula> formulas) {
        this.nameId = nameId;
        this.formulas = formulas;
    }
}