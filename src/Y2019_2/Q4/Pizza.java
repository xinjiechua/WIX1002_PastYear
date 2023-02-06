
package Y2019_2.Q4;

public class Pizza {
    private String size;
    private int numOfCheeseTopping, numOfBeefTopping, numOfChickenTopping;
    
    public Pizza(String size,int numOfCheeseTopping,int numOfBeefTopping, int numOfChickenTopping){
        this.size = size;
        this.numOfCheeseTopping =  numOfCheeseTopping ;
        this.numOfBeefTopping = numOfBeefTopping;
        this.numOfChickenTopping = numOfChickenTopping;
    }
    
    public String getSize(){
        return size;
    }
    
    public int getNumOfCheeseTopping(){
        return numOfCheeseTopping;
    }
    
    public int getNumOfBeefTopping(){
        return numOfBeefTopping;
    }
    
    public int getNumOfChickenTopping(){
        return numOfChickenTopping;
    }

    public void setSize(String size){
        this.size = size;
    }
    
    public void setnumOfCheeseTopping(int numOfCheeseTopping){
        this.numOfCheeseTopping =  numOfCheeseTopping ;
    }
    
     public void setnumOfBeefTopping(int numOfBeefTopping){
        this.numOfBeefTopping =  numOfBeefTopping ;
    }
     
      public void setnumOfChickenTopping(int numOfChickenTopping){
        this.numOfChickenTopping =  numOfChickenTopping ;
    }
      
    public double computeCost() {
        int total = getNumOfCheeseTopping() + getNumOfBeefTopping() +getNumOfChickenTopping();
        switch (size) {
            case "Small":
                return total*2 + 10;
            case "Medium":
                return total*2 + 12;
            default:
                return total*2 + 14;
        }
    }
    
    public void display(){
        System.out.println("Pizza size: " + getSize());
        System.out.println("Number of Cheese Topping: "+ getNumOfCheeseTopping());
        System.out.println("Number of Beef Topping: "+  getNumOfBeefTopping());
        System.out.println("Number of Chicken Topping: "+ getNumOfChickenTopping());
        System.out.println("Cost: $ "+computeCost() + "\n");
        
    }
}
