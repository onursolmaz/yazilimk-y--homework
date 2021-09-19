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
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //create a new default customer as two type
        Customer companyCustomer = new Company(5, "Renova", "Ankara", "5344442", 15, "Nadir Kırgız");
        Customer individualCustomer = new Individual(2, "Onur Solmaz", "Ankara", "54324422", "5455775");


        // create new products
        Product product1 = new Manual("good product", 1, "efective java 3.rd edition", 35.0, "onur solmaz");
        Product product2 = new Software("nice product", 2, "windows 10", 89.0, "A25SK2K6-21KSO1");
        Product product3 = new Hardware("fast ssd", 3, "SSD", 250.0, 24);
        Product product4 = new Hardware("24'inc ıps screen", 4, "LG Screen", 850.0, 12);
        Product product5 = new Software("microsoft office all packet", 5, "Office 365", 50.0, "C25SK2K6-21KSO3");

        List<Product> productsStock = new ArrayList<>(Arrays.asList(product1, product2, product3, product4, product5));


        boolean loopStatus = true;

        while (loopStatus) {

            System.out.println("Are you Company or Individual\n   Company : 1 \n  Individual : 2 ");
            System.out.print("Select your type: ");
            int choiceForCustomerType = input.nextInt();
            Customer selectedCustomerType = choiceForCustomerType == 1 ? companyCustomer : individualCustomer;
            printStockProduct(productsStock);

            // todo new function
            System.out.print("please select your item no : ");
            int selectedProductIndex = input.nextInt();
            System.out.print("Enter your quantity : ");
            int selectedQuantity = input.nextInt();

            /***
             *
             * .......
             */



        }


        //Create order items
//        OrderItem orderItem1=new OrderItem(1,2,product1);
//        OrderItem orderItem2=new OrderItem(2,4,product2);
//        List<OrderItem> items=new ArrayList<>();
//        items.add(orderItem1);
//        items.add(orderItem2);

         //create order
//        Order order=new Order(individualCustomer,1,items, java.util.Date.from( Instant.now()));
//        System.out.println(order.getOrderTotal());
//           print order total (426.0)

    }

    public static void addToBasket(int index,int quantity){

       // todo

    }


    public static void printStockProduct(List<Product> productList) {
        System.out.println("-----------Product List-------------");
        for (Product product : productList) {
            System.out.println((productList.indexOf(product)+1)+"."+product.getName() + "--> PRICE : " + product.getRetailPrice() + "$");
            System.out.println("--------------------------");
        }
    }
}
