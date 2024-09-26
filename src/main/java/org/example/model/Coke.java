package org.example.model;

public class Coke extends ProductForSale{
    private boolean isLight;
    public Coke(String type, double price, String description) {
        super(type, price, description);
    }
    public Coke(String type, double price, String description, boolean isLight) {
        super(type, price, description);
        this.isLight=isLight;
    }



    @Override
    public void showDetails() {
        System.out.println(super.toString()+this);
    }

    @Override
    public String toString() {
        return "Coke{" +
                "isLight=" + isLight +
                '}';
    }


}
