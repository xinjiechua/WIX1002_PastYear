
package Y2019_2.Q6;

public class Order {
    protected String name, ID;
    int quantity;
    double unitPrice;
    
    public Order(){
        name = "";
        ID ="";
        quantity = 0;
        unitPrice = 0;
    }
    
    public Order(String name, String ID,int quantity,double unitPrice){
        this.name = name;
        this.ID = ID;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    
    public double computeTotalPrice(){
        return quantity*unitPrice;
    }
    
    @Override
    public String toString(){
        return "Order record\nCustomer Name : " + name + "\nCustomer Id : " + ID + 
                "\nQuantity ordered: " + quantity + "\nUnit price : " + unitPrice +
                "\nTotal Price : " + computeTotalPrice();
    }
            
}
