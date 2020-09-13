package manage_service;


import java.time.LocalDate;

public final class Session {
    private final Customer customer;
    private Master master;
    private final ServiceType serviceType;
    private double price;
    private LocalDate date;

    public Session(Customer customer,
                   Master master,
                   ServiceType serviceType,
                   double startPrice,
                   LocalDate date){
        this.customer = customer;
        this.master = master;
        this.serviceType = serviceType;
        price = startPrice * (1 - customer.getDiscount());
        this.date = date;
    }




}
