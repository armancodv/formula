package com.armanco.formula.data.models;

public class Section {
    public int nameId;
    public int descriptionId;
    public int imageId;
    public int colorId;
    public Class activityClass;

    public Section(int nameId, int descriptionId, int imageId, int colorId, Class activityClass) {
        this.nameId = nameId;
        this.descriptionId = descriptionId;
        this.imageId = imageId;
        this.colorId = colorId;
        this.activityClass = activityClass;
    }
}
