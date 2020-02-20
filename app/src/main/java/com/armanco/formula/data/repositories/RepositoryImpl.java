package com.armanco.formula.data.repositories;

import com.armanco.formula.R;
import com.armanco.formula.data.models.Formula;
import com.armanco.formula.data.models.Section;
import com.armanco.formula.data.models.SubSection;

import java.util.Arrays;
import java.util.List;

public class RepositoryImpl implements Repository {
    @Override
    public List<Section> getAllSections() {
        return Arrays.asList(
                new Section(R.string.integral_title, R.string.integral_description, R.color.integral, getAllSubSections(R.string.integral_title)),
                new Section(R.string.trigonometry_title, R.string.trigonometry_description, R.color.trigonometry, getAllSubSections(R.string.trigonometry_title)),
                new Section(R.string.differential_title, R.string.differential_description, R.color.differential, getAllSubSections(R.string.differential_title))
        );
    }

    @Override
    public List<SubSection> getAllSubSections(int sectionId) {
        switch (sectionId) {
            case R.string.integral_title:
                return Arrays.asList();
            case R.string.trigonometry_title:
                return Arrays.asList();
            case R.string.differential_title:
                return Arrays.asList();
            default:
                return null;
        }
    }

    @Override
    public List<Formula> getAllFormulas(int subSectionId) {
        return null;
    }

}
