
package Y2019_2.Q6;
import java.util.Scanner;
public class Q6Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name :");
        String name = sc.next();
        System.out.print("Enter customer id:");
        String id = sc.next();
        System.out.print("Enter quantity ordered :");
        int quantity = sc.nextInt();
        System.out.print("Enter price per unit: ");
        double unitPrice = sc.nextDouble();
        
        Order a = new Order(name,id,quantity,unitPrice);
        System.out.println(a);
        
        ShippedOrder b = new ShippedOrder("joe","123",10,5);
        System.out.println(b);
             
        
    }
}
