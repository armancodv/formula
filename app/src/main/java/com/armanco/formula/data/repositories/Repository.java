package com.armanco.formula.data.repositories;

import com.armanco.formula.data.models.Formula;
import com.armanco.formula.data.models.Section;
import com.armanco.formula.data.models.SubSection;

import java.util.List;

public interface Repository {
    List<Section> getAllSections();
    List<SubSection> getAllSubSections(int sectionId);
    List<Formula> getAllFormulas(int subSectionId);
}
