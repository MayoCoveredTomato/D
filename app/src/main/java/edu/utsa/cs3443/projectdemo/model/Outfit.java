package edu.utsa.cs3443.projectdemo.model;

public class Outfit {
    private Shirt shirt;
    private Pants pants;
    private Shoes shoes;

    public Outfit(Shirt shirt, Pants pants, Shoes shoes) {
        this.shirt=shirt;
        this.pants=pants;
        this.shoes=shoes;
    }

    //getters and setters
    public Shirt getShirt() {
        return shirt;
    }
    public Pants getPants() {
        return pants;
    }
    public Shoes getShoes() {
        return shoes;
    }
    public void setShirt(Shirt shirt) {
        this.shirt=shirt;
    }
    public void setPants(Pants pants) {
        this.pants=pants;
    }
    public void setShoes(Shoes shoes) {
        this.shoes=shoes;
    }
}
