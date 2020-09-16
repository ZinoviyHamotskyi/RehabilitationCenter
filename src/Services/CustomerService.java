package Services;

import Entities.*;

import java.time.LocalDate;
import java.util.ArrayList;

public final class CustomerService {
    private final ArrayList<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void removeCustomer(Customer customer){
        if (customers.contains(customer))
            customers.remove(customer);
        else
            throw new RuntimeException("Not found");
    }

    public void customerInfo(){
        System.out.println("==========Customer Info=============");
        for (int i = 1; i <= customers.size(); i++){
            System.out.println(i + ") " + customers.get(i-1));
        }
    }
}
