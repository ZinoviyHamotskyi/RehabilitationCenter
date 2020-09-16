package Main;

import Entities.*;
import Services.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

public final class MyApp{

    public static void main( String[] args ) {
        Service massage = new Service(ServiceType.massage, 300);
        Service lightTraining = new Service(ServiceType.lightTraining, 250);

        Master zhenya = new Master("Zhenya", "Frolov", massage);
        Master andrew = new Master("Andrew", "Zinchenco", lightTraining);

        Customer ivanPetrov = new Customer("Ivan", "Petrov");
        Customer petroIvanov = new Customer("Petro", "Ivanov");

        final CustomerService customerService = new CustomerService();
        customerService.addCustomer(ivanPetrov);
        customerService.addCustomer(petroIvanov);

        final MasterService masterService = new MasterService();
        masterService.addMaster(zhenya);
        masterService.addMaster(andrew);
        masterService.increaseQualification(zhenya, lightTraining);

        final ServiceService serviceService = new ServiceService();
        serviceService.addService(massage);
        serviceService.addService(lightTraining);

        serviceService.serviceInfo();
        masterService.masterInfo();
        customerService.customerInfo();

        gap();

        final SessionService sessionService = new SessionService();
        sessionService.makeAppointment(ivanPetrov,
                massage,
                zhenya,
                new GregorianCalendar(2020,Calendar.OCTOBER,7,14,0));
        sessionService.makeAppointment(petroIvanov,
                lightTraining,
                andrew,
                new GregorianCalendar(2020,Calendar.OCTOBER,1,10,0));

        sessionService.sessionInfo();
        gap();

        Session workSession = sessionService.getSession(ivanPetrov,
                new GregorianCalendar(2020,Calendar.OCTOBER,7,14,0));
        sessionService.startTreat(workSession);
        sessionService.finishTreat(workSession);
        gap();

        sessionService.profit(new GregorianCalendar(2020,Calendar.OCTOBER,6,14,0),
                new GregorianCalendar(2020,Calendar.OCTOBER,8,14,0));

    }


    public static void gap(){
        System.out.println("\n--------------------------------------------------\n");
    }
}