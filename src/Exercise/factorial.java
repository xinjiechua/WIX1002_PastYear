
package Exercise;

import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        
        int result=1;
        while (n>0){
            result *= n;
            n--;
        }   
 
        
        System.out.print("Enter number:");
        int n2 = sc.nextInt();
        sc.nextLine();
        int fact =1;
        if(n2<0)
            System.out.println("Number should be positive");
        else{
            for(int i =1; i<=n2; i++)
                fact *= i;
        }
        
        System.out.println("Factorial = " + result); 
        System.out.println("Factorial = " + fact);
       
    }
 
    
}
