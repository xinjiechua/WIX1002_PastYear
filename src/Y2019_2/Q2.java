
package Y2019_2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of bags sold : ");
        int bags = sc.nextInt();
        System.out.print("Enter the weight per bag (kilogram) : ");
        double weight = sc.nextDouble();
        
        double total = weight*bags*5.99;
        double totalwithtax = total + total*0.0725;
        
        System.out.println("Price per kilogram: $5.99");
        System.out.println("Sales tax:          7.25%");
        System.out.println("Total price:        $ " + totalwithtax);
        
    }
    
}
