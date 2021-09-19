package com.renova.project2.product;

public class Product {

    private String description;
    private int id;
    private String name;
    private Double retailPrice;

    public String getName() {
        return name;
    }

    public Product(String description, int id, String name, Double retailPrice) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.retailPrice = retailPrice;
    }

    public String getDescription(){
        return this.description;
    }

    public Double getRetailPrice() {
        return retailPrice;
    }

    // do override in extended classes
    public Double getTax(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", retailPrice=" + retailPrice +
                '}';
    }
}
