package manage_service;

public class Service {
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

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setType(ServiceType type) {
        this.type = type;
    }

    public ServiceType getType() {
        return type;
    }
}
