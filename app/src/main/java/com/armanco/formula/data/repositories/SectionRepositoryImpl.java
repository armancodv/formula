package com.armanco.formula.data.repositories;

import com.armanco.formula.data.models.Section;

import java.util.ArrayList;
import java.util.List;

public class SectionRepositoryImpl implements SectionRepository {
    @Override
    public List<Section> getAll() {
        return new ArrayList<Section>();
    }
}
