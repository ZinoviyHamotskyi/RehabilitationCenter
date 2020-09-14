package manage_service;

import java.util.ArrayList;

public final class Master {
    private final String name;
    private final String surname;
    private double bonus;
    public State state;
    private ArrayList<Service> serviceList;

    public Master(String name,
                  String surname,
                  ArrayList<Service> services){
        this.bonus = 0;
        this.name = name;
        this.surname = surname;
        this.state = State.free;
        this.serviceList = services;
    }

    public void setBonus(double new_bonus){
        this.bonus = new_bonus;
    }

    public String toString(){
        return "Master " +
                name + surname +
                "(bonus: " +
                bonus + "; " +
                serviceList.toString() + ")";
    }

    public void treat(){
        System.out.println(this.toString() + " treats");
    }

    public void addService(Service service){
        serviceList.add(service);
    }

    public boolean canDo(Service service){
        for (int i = 0; i < serviceList.size(); i++) {
            if (service == serviceList.get(i)) return true;
        }
        return false;
    }
}
