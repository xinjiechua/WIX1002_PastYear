
package y2016.Q5;

public class CreditCard {
    protected String name, type, num;
    protected double reward;
    
    public CreditCard(String name,String num){
        this.name = name;
        this.num = num;
    }
    
    public void setReward(double reward){
        this.reward = reward;
    }
    
    public double getReward(){
        if(type.equals("cash rebate"))
            return reward;
        else
            return reward;
    }
    
    public String toString(){
        return "Credit Card : " + name + " (" + num + ")\nCard Type : " + type 
                + "\nTotal Cash Reward : " + getReward();
    }
    
}
