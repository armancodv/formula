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
                return Arrays.asList(
                        new SubSection(R.string.integral_rational, getAllFormulas(R.string.integral_rational)),
                        new SubSection(R.string.integral_exponential, getAllFormulas(R.string.integral_exponential)),
                        new SubSection(R.string.integral_logarithms, getAllFormulas(R.string.integral_logarithms)),
                        new SubSection(R.string.integral_trigonometric, getAllFormulas(R.string.integral_trigonometric)),
                        new SubSection(R.string.integral_inverse_trigonometric, getAllFormulas(R.string.integral_inverse_trigonometric)),
                        new SubSection(R.string.integral_hyperbolic, getAllFormulas(R.string.integral_hyperbolic)),
                        new SubSection(R.string.integral_inverse_hyperbolic, getAllFormulas(R.string.integral_inverse_hyperbolic)),
                        new SubSection(R.string.integral_second_derivatives, getAllFormulas(R.string.integral_second_derivatives)),
                        new SubSection(R.string.integral_absolute_value, getAllFormulas(R.string.integral_absolute_value)),
                        new SubSection(R.string.integral_special, getAllFormulas(R.string.integral_special)),
                        new SubSection(R.string.integral_definite, getAllFormulas(R.string.integral_definite))
                );
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
        return Arrays.asList(
                new Formula("test"),
                new Formula("test2"),
                new Formula("test3")
        );
    }

    @Override
    public Section getSectionByPosition(int sectionPosition) {
        return getAllSections().get(sectionPosition);
    }

    @Override
    public List<SubSection> getAllSubSectionsByPosition(int sectionPosition) {
        return getSectionByPosition(sectionPosition).subSections;
    }

    @Override
    public SubSection getSubSectionByPosition(int sectionPosition, int subSectionPosition) {
        return getAllSubSectionsByPosition(sectionPosition).get(subSectionPosition);
    }

    @Override
    public List<Formula> getAllFormulasByPosition(int sectionPosition, int subSectionPosition) {
        return getSubSectionByPosition(sectionPosition, subSectionPosition).formulas;
    }

}
