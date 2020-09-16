package Entities;

import java.util.Calendar;
import java.util.GregorianCalendar;

public final class Session {
    private final Customer customer;
    private final Master master;
    private final Service service;
    private final double price;
    private final Calendar date;

    public Session(Customer customer,
                   Master master,
                   Service service,
                   GregorianCalendar date){
        this.customer = customer;
        this.master = master;
        this.service = service;
        price = service.getPrice() * (1 - customer.getDiscount());
        this.date = date;
    }

    public Master getMaster() {
        return master;
    }

    public  Calendar getDate(){
        return date;
    }

    public double getPrice() {
        return price;
    }

    public Customer getCustomer(){
        return customer;
    }

    public String toString(){
        return "Session Info:\n\t" +
                customer.toString() +
                "\n\t" + master.toString() +
                "\n\t" + service.toString() +
                "\n\tDate: " + date.getTime() +
                "\n\tPrice: " + price + "\n";
    }

}
