package Y2017_2.Q5;

public class PartTimeStaff extends Staff{
    private int hours;
    
    public PartTimeStaff(String name, String IC,int hours){
        super(name,IC);
        this.hours = hours;
    }
    
    public int getSalary(){
        return hours*40;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nNumber of working hours: " + hours + "\nSalary: RM " + getSalary();
    }
    
}
