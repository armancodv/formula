package com.armanco.formula.data.repositories;

import com.armanco.formula.R;
import com.armanco.formula.data.models.Section;

import java.util.Arrays;
import java.util.List;

public class RepositoryImpl implements Repository {
    @Override
    public List<Section> getAllSections() {
        return Arrays.asList(
                new Section(R.string.integral_title, R.string.integral_description, R.color.integral, null),
                new Section(R.string.trigonometry_title, R.string.trigonometry_description, R.color.trigonometry, null),
                new Section(R.string.differential_title, R.string.differential_description, R.color.differential, null)
        );
    }

}
