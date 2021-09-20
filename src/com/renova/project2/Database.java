package com.renova.project2;

import com.renova.project2.customer.Company;
import com.renova.project2.customer.Customer;
import com.renova.project2.customer.Individual;
import com.renova.project2.product.Hardware;
import com.renova.project2.product.Manual;
import com.renova.project2.product.Product;
import com.renova.project2.product.Software;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// this class work as like Database to get product list and customer types
public class Database {

    public static List<Product> getProductList() {
        Product product1 = new Manual("good product", 1, "efective java 3.rd edition", 35.0, "onur solmaz");
        Product product2 = new Software("nice product", 2, "windows 10", 89.0, "A25SK2K6-21KSO1");
        Product product3 = new Hardware("fast ssd", 3, "SSD", 250.0, 24);
        Product product4 = new Hardware("24'inc ıps screen", 4, "LG Screen", 850.0, 12);
        Product product5 = new Software("microsoft office all packet", 5, "Office 365", 50.0, "C25SK2K6-21KSO3");

        List<Product> productList = new ArrayList<>(Arrays.asList(product1, product2, product3, product4, product5));
        return productList;
    }

    public static Customer getCompanyCustomer() {
        Customer companyCustomer = new Company(5, "Renova", "Ankara", "53444", 15, "54235411");
        return companyCustomer;
    }

    public static Customer getIndividualCustomer() {
        Customer individualCustomer = new Individual(2, "Onur Solmaz", "Ankara", "54324422", "5455775");
        return individualCustomer;
    }


}
