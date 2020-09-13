package manage_service;

public final class Hostess {
    private final String name;
    private final String surname;
    private double bonus;

    public Hostess(String name,
                   String surname){
        this.bonus = 0;
        this.name = name;
        this.surname = surname;
    }

    public void setBonus(double new_bonus){
        this.bonus = new_bonus;
    }

    public String toString(){
        return "Hostess " +
                name + surname +
                "(bonus: " +
                bonus + ")";
    }

    public void makeAppointment(){
        System.out.println(this.toString() + " makes an appointment");
    }
}
