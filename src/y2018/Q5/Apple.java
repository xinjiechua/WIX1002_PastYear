
package y2018.Q5;

public class Apple extends Fruit{
    protected int num;
    
    public Apple(String name, String type,int num){
        super(name,type);
        this.num = num;
    }
    
    @Override
    public double totalPrice(){
        if(type.equals("Red"))
            return num*1.8;
        else 
            return num*1.2;
        
    }
         
    public String toString(){
        return super.toString() + num + " = RM " + totalPrice();
    }
    
}
