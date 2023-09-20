package Doctors;

public class Surgeon extends Doctor{

    public Surgeon(String name){
        super(name);
    }

    @Override
    public String getSchedule(){
        return "Monday, Tuesday, Friday, and Sunday";
    }
}
