package Y2019.Q5;

public class SpecialDelivery extends Delivery {
    boolean weekend, nighttime;

    public SpecialDelivery(String sender, String recipient, double weight, boolean weekend, boolean nighttime){
        super(sender,recipient,weight);
        this.weekend = weekend;
        this.nighttime = nighttime;
    }

    @Override
    public double totalCost(){
        if((weekend && nighttime))
            return((super.totalCost()+50)*1.2);
        else if(weekend)
            return(super.totalCost() + 50);
        else if(nighttime)
            return(super.totalCost()*1.2);
        else
            return(super.totalCost());
    }
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("From : ").append(sender).append("To: ").append(recipient).append("\nWeight of Package : ")
                .append(weight).append(" kg \nShipping Cost : RM").append(totalCost());
        if(weekend)
            str.append("\nWeekend Delivery");
        if(nighttime)
            str.append("\nNight Time Delivery");
        return String.valueOf(str);
    }
}
