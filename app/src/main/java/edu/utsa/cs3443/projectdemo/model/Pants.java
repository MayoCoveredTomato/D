package edu.utsa.cs3443.projectdemo.model;

public class Pants implements ClothingItem{
    private String name;
    private int rarity;
    private String type;
    private String imageId;

    public Pants (String name, int rarity, String type, String imageId) {
        this.name=name;
        this.rarity=rarity;
        this.type=type;
        this.imageId=imageId;
    }

    @Override
    public String getName() {
// TODO Auto-generated method stub
        return name;
    }

    @Override
    public int getRarity() {
// TODO Auto-generated method stub
        return rarity;
    }

    @Override
    public String getType() {
// TODO Auto-generated method stub
        return type;
    }

    @Override
    public String getImageID() {
// TODO Auto-generated method stub

        return imageId;
    }

    public String description() {
        return getName() + ", a " + getType() + " type. Rarity Level: " + getRarity();
    }
}
