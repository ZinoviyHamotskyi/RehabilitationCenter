package manage_service;


import java.time.LocalDate;

public final class Session {
    private final Customer customer;
    private Master master;
    private final Service service;
    private double price;
    private LocalDate date;

    public Session(Customer customer,
                   Master master,
                   Service service,
                   LocalDate date){
        this.customer = customer;
        this.master = master;
        this.service = service;
        price = service.getPrice() * (1 - customer.getDiscount());
        this.date = date;
    }

    public void setMaster(Master master){
        if (master.serviceList.contains(service)){
            this.master = master;
        }
        else {
            System.out.println("Error: this master cannot do this service");
        }
    }

    public Master getMaster() {
        return master;
    }

    public void setDate(LocalDate date){
        this.date = date;
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
                "\n\tDate: " + date.toString() +
                "\n\tPrice: " + price + "\n";
    }

}
