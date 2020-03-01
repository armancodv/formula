package com.armanco.formula.data.repositories;

import android.content.Context;

import com.armanco.formula.R;
import com.armanco.formula.data.models.Section;
import com.armanco.formula.view.main.MainActivity;

import java.util.Arrays;
import java.util.List;

public class SectionRepositoryImpl implements SectionRepository {
    @Override
    public List<Section> getAll() {
        return Arrays.asList(
                new Section(R.string.integral_title, R.string.integral_description, R.drawable.integral, R.color.integral, MainActivity.class),
                new Section(R.string.trigonometry_title, R.string.trigonometry_description, 0, R.color.trigonometry, MainActivity.class),
                new Section(R.string.differential_title, R.string.differential_description, 0, R.color.differential, MainActivity.class)
        );
    }

}
