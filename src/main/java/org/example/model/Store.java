package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[5];
        products[0]=new Bread("food",10,"odun fırrını ekmeği","kepekli");
        products[1]=new Coke("drink",80,"asitli içecek",true);
        products[2]=new Chocolate("food",60,"tatlı atıştırmalık","bitter");

        listProducts(products);

    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            if(product != null){
                product.showDetails();
            }else{
                System.out.println("yok");
            }
        }
    }
}