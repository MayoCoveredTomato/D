package edu.utsa.cs3443.projectdemo.model;

public interface ClothingItem {
    public String getName();
    public int getRarity();
    public String getType();
    public String getImageID();
    public String description();
    /*
     * description is the same a toString,
     * the only difference is that its
     * formatted a little differently
     */
}
