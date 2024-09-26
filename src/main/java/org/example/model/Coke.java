package org.example.model;

public class Coke extends ProductForSale{
    private boolean isLight;
    public Coke(String type, double price, String description, boolean isLight) {
        super(type, price, description);
        this.isLight=isLight;
    }

    public boolean isLight() {
        return isLight;
    }

    @Override
    public String showDetails() {
        return "Type: " + this.getType() +"Price: " + this.getPrice() +"Description: "+ this.getDescription()+ "isLight: " + this.isLight();
    }

    public void healthyCoke(){
        if(isLight()==true){
            System.out.println("This coke has no sugar");
        }else{
            System.out.println("This coke is not healthy");
        }
    }
}
