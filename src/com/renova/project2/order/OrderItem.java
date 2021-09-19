package com.renova.project2.order;

import com.renova.project2.product.Product;

public class OrderItem {

    private int lineNbr;
    private int quantity;
    private Product product;

    public OrderItem(int lineNbr, int quantity, Product product) {
        this.lineNbr = lineNbr;
        this.quantity = quantity;
        this.product = product;
    }

    public Double getItemTotal(){
        Double total=this.product.getRetailPrice()*quantity;
        return total;
    }

    public int getLineNbr() {
        return lineNbr;
    }

    public void setLineNbr(int lineNbr) {
        this.lineNbr = lineNbr;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double getTax(){
        return this.product.getTax();
    }
}
