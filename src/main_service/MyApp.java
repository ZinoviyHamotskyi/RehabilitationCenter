package main_service;

import manage_service.Customer;

public final class MyApp{

    public static void main( String[] args ) {
        System.out.println("Hello");
        Customer c = new Customer("Sany", "Ivanov");
        c.visitCenter();

    }
}