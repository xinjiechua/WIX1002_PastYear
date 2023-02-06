
package Y2015_M;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type;
        double sales, total = 0;
        System.out.print("Enter the type of durian [Quit] to terminate: ");
        type = sc.next();
        
        while(!"Quit".equals(type)){
            System.out.print("Enter the sales in kg: ");
            sales =  sc.nextDouble();
            switch(type){
                case "MK":
                    total+= sales*25;
                    break;
                case "HL":
                    total+= sales*22;
                    break;
                case "D24":
                    total+= sales*20;
                    break;
                case "UM":
                    total+= sales*18;
                    break;
            }
                
            System.out.print("Enter the type of durian [Quit] to terminate: ");
            type = sc.next();
        }
        System.out.println("Total Sales: " + total);    
    }
}
