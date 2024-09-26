package org.example.model;

public class Chocolate extends ProductForSale{
    private String chocolateType;
    public Chocolate(String type, double price, String description, String chocolateType) {
        super(type, price, description);
        this.chocolateType=chocolateType;
    }

    public String getChocolateType() {
        return chocolateType;
    }

    @Override
    public String showDetails() {
        return "Type: " + this.getType() +"Price: " + this.getPrice() +"Description: "+ this.getDescription() +"Chocolate Type: " +this.getChocolateType();
    }
}
