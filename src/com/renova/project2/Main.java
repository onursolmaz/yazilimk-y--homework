package com.renova.project2;

import com.renova.project2.customer.Company;
import com.renova.project2.customer.Customer;
import com.renova.project2.order.Order;
import com.renova.project2.order.OrderItem;
import com.renova.project2.product.Product;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // define the variables required for the program to run.
    static Scanner input = new Scanner(System.in);
    static List<Product> productList = Database.getProductList();
    public static List<OrderItem> orderItemList = new ArrayList<>();
    public static Customer customerType;

    public static void main(String[] args) {

        // choice your customer type
        System.out.println("Are you Company or Individual ?\n   Company : 1 \n   Individual : 2 ");
        System.out.println("Select your type: ");

        // if selected 1 programs works according the company customer, if selected 2 works individual customer
        int choiceForCustomerType = input.nextInt();
        customerType = choiceForCustomerType == 1 ? Database.getCompanyCustomer() : Database.getIndividualCustomer();

        boolean loopStatus = true;

        while (loopStatus) {

            printProducts(productList);

            System.out.print("=> add to basket[1] show my basket[2] to order and exit[3]  exit[4] : ");
            int choice = input.nextInt();

            switch (choice){

                case 1:
                    System.out.print("Enter your product index : ");
                    int productIndex = input.nextInt()-1;
                    System.out.print("Enter quantity : ");
                    int quantity = input.nextInt();
                    addToBasket(productIndex,quantity);
                    break;

                case 2:
                    showMyBasket();
                    break;

                case 3:
                    createOrder();
                    loopStatus=false;
                    break;

                case 4:
                    loopStatus=false;
                    break;
            }
        }
    }

    public static void showMyBasket() {
        System.out.println("-------- MY BASKET-----------");
        for(OrderItem orderItem:orderItemList){
            System.out.println("Product name: "+ orderItem.getProduct().getName()+" Price : "+ orderItem.getProduct().getRetailPrice()+
                    " quantity: "+ orderItem.getQuantity());
        }
        System.out.println("--------------------");

    }

    public static void addToBasket(int index, int quantity) {
        Product product = productList.get(index);
        OrderItem orderItem = new OrderItem(index+1, quantity, product);
        orderItemList.add(orderItem);
        System.out.println("Product added to basket successfully");
    }

    public static void createOrder(){
        Order order=new Order(customerType,1,orderItemList, java.util.Date.from( Instant.now()));
        double totalPrice=order.getOrderTotal();
        // Company customer has a discount
        if(customerType instanceof Company){
            double discountRate=(double)((Company)customerType).getDiscount()/100;
            totalPrice-=totalPrice*discountRate;
        }
        System.out.println("************\nTotal order price: " + totalPrice);
        System.out.println("Your order has been successfully created");

    }

    public static void printProducts(List<Product> productList) {
        System.out.println("-----------Product List-------------");
        for (Product product : productList) {
            System.out.println((productList.indexOf(product) + 1) + "." + product.getName() + "--> PRICE : " + product.getRetailPrice() + "$");
        }
        System.out.println("--------------------");
    }
}
