package org.example.model;

public class Bread extends ProductForSale{
    private String breadType;
    public Bread(String type, double price, String description, String breadType) {
        super(type, price, description);
        this.breadType=breadType;
    }

    public String getBreadType() {
        return breadType;
    }

    @Override
    public String showDetails() {
        return "Type: " + this.getType() +"Price: " + this.getPrice() +"Description: "+ this.getDescription() + "Bread Type: " + this.getBreadType();
    }
}
