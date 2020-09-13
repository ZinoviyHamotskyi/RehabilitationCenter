package manage_service;

import java.util.ArrayList;

public final class Master {
    private final String name;
    private final String surname;
    private double bonus;
    private State state;
    private ArrayList<ServiceType> serviceList;

    public Master(String name,
                  String surname,
                  ArrayList<ServiceType> serviceList){
        this.bonus = 0;
        this.name = name;
        this.surname = surname;
        this.state = State.free;
        this.serviceList = serviceList;
    }

    public void setBonus(double new_bonus){
        this.bonus = new_bonus;
    }

    public String toString(){
        return "Master " +
                name + surname +
                "(bonus: " +
                bonus + "; services: " +
                serviceList + ")";
    }

    public void treat(){
        System.out.println(this.toString() + " treats");
    }
}
