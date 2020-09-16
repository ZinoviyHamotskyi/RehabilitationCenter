package Services;

import Entities.Customer;
import Entities.Master;
import Entities.Service;
import Entities.Session;

import java.util.ArrayList;
import java.util.GregorianCalendar;


final public class SessionService {

    private final ArrayList<Session> sessions = new ArrayList<>();

    public void startTreat(Session session){
        session.getCustomer().visitCenter();
        session.getMaster().treat();
    }

    public void makeAppointment(Customer customer,
                                Service service,
                                Master master,
                                GregorianCalendar date){
        Session session = new Session(customer, master, service, date);
        sessions.add(orderIndex(date), session);
    }

    public int orderIndex(GregorianCalendar date){
        for (int i = 0; i < sessions.size(); i++){
            if (sessions.get(i).getDate().after(date))
                return i;
        }
        return 0;
    }

    public Session getSession(Customer customer,
                              GregorianCalendar date){
        ArrayList<Session> searched = new ArrayList<>();
        sessions.stream().filter(session -> {
            return session.getDate().equals(date) && session.getCustomer().equals(customer);
        }).forEach(searched::add);
        return searched.get(0);
    }

    public void removeSession(Session session){
        sessions.remove(session);
    }

    public void  finishTreat(Session session){
        session.getMaster().finishTreatment();
        session.getCustomer().leaveCenter();
    }

    public void sessionInfo(){
        System.out.println("==========Session Info=============");
        for (int i = 1; i <= sessions.size(); i++){
            System.out.println(i + ") " + sessions.get(i-1));
        }
    }

    public void profit(GregorianCalendar start,
                       GregorianCalendar finish){
        double profit = 0;
        for (Session session : sessions) {
            if (session.getDate().after(start) && session.getDate().before(finish))
                profit = profit + session.getPrice();
        }
        System.out.println("Total profit from" +
                start.getTime() + " to " +
                finish.getTime() + " : " +
                profit);
    }
}
