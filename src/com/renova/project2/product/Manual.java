package com.renova.project2.product;

public class Manual extends Product{

    private String publisher;


    public Manual(String description, int id, String name, Double retailPrice, String publisher) {
        super(description, id, name, retailPrice);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }


}
