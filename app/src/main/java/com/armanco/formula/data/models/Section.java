package com.armanco.formula.data.models;

import java.util.List;

public class Section {
    public int nameId;
    public int imageId = 0;
    public int descriptionId;
    public int colorId;
    public List<SubSection> subSections;

    public Section(int nameId, int descriptionId, int colorId, List<SubSection> subSections) {
        this.nameId = nameId;
        this.descriptionId = descriptionId;
        this.colorId = colorId;
        this.subSections = subSections;
    }
}
