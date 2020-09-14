package manage_service;

import java.time.LocalDate;
import java.util.ArrayList;

public final class ManageService {
    private final ArrayList<Customer> customers = new ArrayList<>();
    private final ArrayList<Hostess> hostesses = new ArrayList<>();
    private final ArrayList<Service> services = new ArrayList<>();
    private final ArrayList<Master> masters = new ArrayList<>();
    private final ArrayList<Session> sessions = new ArrayList<>();

    public void addHostess(Hostess hostess){
        hostesses.add(hostess);
    }

    public void addMaster(Master master){
        masters.add(master);
        for (int i = 0; i < master.serviceList.size(); i++){
            if (services.isEmpty()){
                services.add(master.serviceList.get(i));
                continue;
            }
            for (int j = 0; j < services.size(); j++){
                if(services.get(j) == master.serviceList.get(i)){
                    continue;
                }
                services.add(master.serviceList.get(i));
                break;
            }
        }
    }

    public void removeHostess(Hostess hostess){
        hostesses.remove(hostess);
    }

    public Session getSession(int index) {
        return sessions.get(index);
    }

    public void makeAppointment(Customer customer,
                                Service service,
                                Master master,
                                LocalDate date){
        hostesses.get(0).makeAppointment();
        customers.add(customer);
        Session session = new Session(customer, master, service, date);
        System.out.println(session.toString());
        sessions.add(session);
    }

    public void startTreat(Session session){
        session.getCustomer().visitCenter();
        session.getMaster().treat();
    }

    public void  finishTreat(Session session){
        session.getMaster().finishTreatment();
        session.getCustomer().leaveCenter();
    }

    public void hostessInfo(){
        System.out.println("==========Hostess Info=============");
        for (int i = 1; i <= hostesses.size(); i++){
            System.out.println(i + ") " + hostesses.get(i-1));
        }
    }

    public void masterInfo(){
        System.out.println("==========Master Info=============");
        for (int i = 1; i <= masters.size(); i++){
            System.out.println(i + ") " + masters.get(i-1));
        }
    }

    public void customerInfo(){
        System.out.println("==========Customer Info=============");
        for (int i = 1; i <= customers.size(); i++){
            System.out.println(i + ") " + customers.get(i-1));
        }
    }

    public void serviceInfo(){
        System.out.println("==========Service Info=============");
        for (int i = 1; i <= services.size(); i++){
            System.out.println(i + ") " + services.get(i-1));
        }
    }

    public void centerInfo(){
        System.out.println("################ CENTER INFO ################");
        hostessInfo();
        serviceInfo();
        masterInfo();
        customerInfo();
    }

    public void sessionInfo(){
        System.out.println("==========Session Info=============");
        for (int i = 1; i <= sessions.size(); i++){
            System.out.println(i + ") " + sessions.get(i-1));
        }
    }
}
