package Y2019.Q5;

public class Delivery {
    protected String sender, recipient;
    protected double weight;

    public Delivery(String sender, String recipient, double weight){
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
    }

    public double totalCost(){
        if(weight<=5)
            return weight*2.8;
        else if(weight<=20)
            return 2.8*5 + 5.2*(weight-5);
        else if(weight<=50)
            return 2.8*5 + 5.2*15 + 7*(weight-20);
        else
            return 2.8*5 + 5.2*15 + 7*30 + 8.6*(weight-50);
    }

    public String toString(){
        return "From : " + sender + " To: " + recipient + "\nWeight of Package : "+
                weight + " kg \nShipping Cost : RM" + totalCost();
    }
}
