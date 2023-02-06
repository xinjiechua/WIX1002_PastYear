
package Y2019_2.Q6;

public class ShippedOrder extends Order{
   
    public ShippedOrder(String name, String ID,int quantity,double unitPrice){
        super(name,ID,quantity,unitPrice);
    }
    
    @Override
    public double computeTotalPrice(){
        return super.computeTotalPrice()+ 4;
    }
    
    @Override
    public String toString(){
        return "Shipped\nOrder record\nCustomer Name : " + name + "\nCustomer Id : " 
                + ID + "\nQuantity ordered: " + quantity + "\nUnit price : " + unitPrice 
                + "\nTotal Price : " + computeTotalPrice();
    }
}
