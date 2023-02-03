
package y2016.Q5;

public class Rebate extends CreditCard {
    
    public Rebate(String name, String num){
        super(name,num);
        super.type = "Cash Rebate";
    }
    
    public double getReward(String type, double price){
        switch(type){
            case "Grocery" :
                return reward += price*0.02;
            case "Other" :
                return reward += price*0.002;
            case "Fuel" :
                return reward += price*0.08; 
            case "Utility" :
                return reward += price*0.05;
            default:
                return reward += 0;
        }
    }
}
