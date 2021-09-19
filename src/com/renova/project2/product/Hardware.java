package com.renova.project2.product;

public class Hardware extends Product implements Taxable{


    private int warrantyPeriod;


    public Hardware(String description, int id, String name, Double retailPrice, int warrantyPeriod) {
        super(description, id, name, retailPrice);
        this.warrantyPeriod=warrantyPeriod;
    }

    @Override
    public Double getTax() {
        // default tax=5;
        return 5.0;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }


}
