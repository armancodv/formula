package com.armanco.formula.data.repositories;

import com.armanco.formula.data.models.Section;

import java.util.Arrays;
import java.util.List;

public class SectionRepositoryImpl implements SectionRepository {
    @Override
    public List<Section> getAll() {
        return Arrays.asList(
                new Section(1, "test", 1),
                new Section(1, "test2", 1),
                new Section(1, "test3", 1)
        );
    }
}
