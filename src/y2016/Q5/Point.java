
package y2016.Q5;

public class Point extends CreditCard{
    
    public Point (String name, String num){
        super(name,num);
        super.type = "Point Reward";
    }
     
    public double getReward(String day, double price){
        switch (day){
            case "Friday":
               return reward += Math.floor(price)*0.02;
            case "Saturday":
               return reward += Math.floor(price)*0.03;
            case "Sunday":
               return reward += Math.floor(price)*0.04;
            default:
               return reward += Math.floor(price)*0.01;
        }
    }   
}
