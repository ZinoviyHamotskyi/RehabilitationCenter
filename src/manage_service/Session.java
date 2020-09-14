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
                   double startPrice,
                   LocalDate date){
        this.customer = customer;
        this.master = master;
        this.service = service;
        price = service.getPrice() * (1 - customer.getDiscount());
        this.date = date;
    }

    public void setMaster(Master master){
        if(master.canDo(this.service)){
            this.master = master;
        }
        else {
            System.out.println("Error: this master cannot do this service");
        }
    }

    public void setDate(LocalDate date){
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public String toString(){
        return "Session Info:\n\t" +
                customer.toString() +
                "\t" + master.toString() +
                "\t" + service.toString() +
                "\t" + date.toString() +
                "\tPrice: " + price + "\n";
    }

}
