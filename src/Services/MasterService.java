package Services;

import Entities.Master;
import Entities.Service;

import java.util.ArrayList;

public class MasterService {
    private final ArrayList<Master> masters = new ArrayList<>();

    public void addMaster(Master master){
        masters.add(master);
    }

    public void increaseQualification(Master master,
                                      Service service){
        if (masters.contains(master))
            masters.get(masters.indexOf(master)).addService(service);
        else
            throw new RuntimeException("Not found");
    }

    public void giveBonus(Master master,
                          double bonus){
        if (masters.contains(master))
            masters.get(masters.indexOf(master)).setBonus(bonus);
        else
            throw new RuntimeException("Not found");
    }

    public void removeMaster(Master master){
        if (masters.contains(master))
            masters.remove(master);
        else
            throw new RuntimeException("Not found");
    }

    public void masterInfo(){
        System.out.println("==========Master Info=============");
        for (int i = 1; i <= masters.size(); i++){
            System.out.println(i + ") " + masters.get(i-1));
        }
    }

}
