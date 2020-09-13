package manage_service;

public final class Customer {
    private final String name;
    private final String surname;
    private double discount;

    public Customer(String name,
             String surname){
        this.discount = 0.0;
        this.name = name;
        this.surname = surname;
    }

    public void setDiscount(double new_discont){
        this.discount = new_discont;
    }

    public String toString(){
        return "Customer " +
                name + surname +
                "(discount coefficient: " +
                discount + ")";
    }

    public void VisitCenter(){
        System.out.println(this.toString() + " visits the Center");
    }
}
