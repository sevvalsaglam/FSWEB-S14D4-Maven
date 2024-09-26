package org.example.model;

public class Chocolate extends ProductForSale{
    private String chocolateType;
    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }
    public Chocolate(String type, double price, String description, String chocolateType) {
        super(type, price, description);
        this.chocolateType=chocolateType;
    }

    public String getChocolateType() {
        return chocolateType;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString()+this);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "chocolateType='" + chocolateType + '\'' +
                '}';
    }
}
