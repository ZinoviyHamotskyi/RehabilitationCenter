package Entities;

final public class Service {
    private ServiceType type;
    private double price;

    public Service(ServiceType type,
                   double price){
        this.price = price;
        this.type = type;
    }

    public String toString(){
        return "Service: " +
                type.toString() +
                " ,price: " +
                price + "; ";
    }

    public double getPrice() {
        return price;
    }

    public ServiceType getType() {
        return type;
    }
}
