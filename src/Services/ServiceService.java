package Services;

import Entities.Master;
import Entities.Service;

import java.util.ArrayList;

public class ServiceService {
    private final ArrayList<Service> services = new ArrayList<>();

    public void addService(Service service){
        services.add(service);
    }

    public void removeService(Service service){
        if (services.contains(service))
            services.remove(service);
        else
            throw new RuntimeException("Not found");
    }

    public void serviceInfo(){
        System.out.println("==========Service Info=============");
        for (int i = 1; i <= services.size(); i++){
            System.out.println(i + ") " + services.get(i-1));
        }
    }
}
