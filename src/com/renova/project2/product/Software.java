package com.renova.project2.product;

public class Software extends Product{

    private String license;

    public Software(String description, int id, String name, Double retailPrice, String license) {
        super(description, id, name, retailPrice);
        this.license = license;
    }

    public String getLicense() {
        return license;
    }


}
