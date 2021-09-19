package com.renova.project2.order;

import com.renova.project2.customer.Customer;

import java.util.Date;
import java.util.List;

public class Order {

    private Customer customer;
    private int id;
    private List<OrderItem> items;
    private Date orderDate;
    private Double orderTotal;


    public Order(Customer customer, int id, List<OrderItem> items, Date orderDate) {
        this.customer = customer;
        this.id = id;
        this.items = items;
        this.orderDate = orderDate;
    }

    public void addOrderItem(OrderItem item) {
        this.items.add(item);
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getId() {
        return id;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Double getOrderTotal() {
        Double total = 0.0;
        for (OrderItem item : items) {
            total +=item.getItemTotal();
        }
        return total;
    }
}
