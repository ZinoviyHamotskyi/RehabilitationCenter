package Main;

import manage_service.*;

import java.time.LocalDate;
import java.util.ArrayList;

public final class MyApp{

    public static void main( String[] args ) {
        Hostess vika = new Hostess("Vika", "Ryaboshapko");

        Service massage = new Service(ServiceType.massage, 300);
        Service lightTraining = new Service(ServiceType.lightTraining, 250);

        Master zhenya = new Master("Zhenya", "Frolov", massage);


        Customer ivanPetrov = new Customer("Ivan", "Petrov");
        Customer petroIvanov = new Customer("Petro", "Ivanov");

        ManageService center = new ManageService();

        center.addHostess(vika);
        center.addMaster(zhenya);

        center.centerInfo();

        gap();

        zhenya.addService(lightTraining);
        center.makeAppointment(ivanPetrov, lightTraining, zhenya,
                LocalDate.of(2020, 9, 16));

        center.startTreat(center.getSession(0));

        gap();

        center.masterInfo();
        center.serviceInfo();

        gap();

        center.finishTreat(center.getSession(0));



    }

    public static void gap(){
        System.out.println("--------------------------------------------------");
    }
}