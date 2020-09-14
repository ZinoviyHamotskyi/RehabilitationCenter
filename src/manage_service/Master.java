package manage_service;

import java.util.ArrayList;

public final class Master {
    private final String name;
    private final String surname;
    private double bonus;
    public State state;
    public ArrayList<Service> serviceList;

    public Master(String name,
                  String surname,
                  Service service){
        this.bonus = 0;
        this.name = name;
        this.surname = surname;
        this.state = State.free;
        this.serviceList = new ArrayList<>();
        serviceList.add(service);
    }

    public void setBonus(double new_bonus){
        this.bonus = new_bonus;
    }

    public void addService(Service service){
        serviceList.add(service);
    }

    public String toString(){
        return "Master " +
                name + surname +
                "(bonus: " + bonus + "; " +
                typesToString() + "; " +
                "State: " +
                state.toString() + ")";
    }

    public void treat(){
        System.out.println(this.toString() + " treats");
        state = State.busy;
    }

    public String typesToString(){
        StringBuilder types = new StringBuilder("Service types: ");
        for (Service service : serviceList) types.append(service.getType().toString()).append(", ");
        return types.toString();
    }

    public void finishTreatment(){
        System.out.println(this.toString() + "finished treatment");
        state = State.busy;
    }
}
