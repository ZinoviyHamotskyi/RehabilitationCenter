package manage_service;

import java.util.ArrayList;

public final class ManageService {
    private ArrayList<Customer> customers;
    private ArrayList<Hostess> hostesses;
    private ArrayList<Service> services;
    private ArrayList<Master> masters;
    private ArrayList<Session> sessions;

    public void addHostess(Hostess hostess){
        hostesses.add(hostess);
    }

    public void addMaster(Master master){
        masters.add(master);
        
    }





}
