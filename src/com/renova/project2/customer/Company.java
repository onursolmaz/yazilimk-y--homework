package com.renova.project2.customer;

public class Company extends Customer {

    private int discount;
    private String contact;


    public Company(int id, String name, String address, String phone, int discount, String contact) {
        super(id, name, address, phone);
        this.discount = discount;
        this.contact = contact;
    }

    public int getDiscount() {
        return discount;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
