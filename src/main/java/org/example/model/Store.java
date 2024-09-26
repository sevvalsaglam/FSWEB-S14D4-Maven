package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale coke = new Coke("drink", 90, "fizzy drink",true);
        coke.showDetails();
        //listProducts();

    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}