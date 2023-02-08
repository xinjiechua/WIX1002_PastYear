
package Exercise;

//Fibonacci series - each number is the sum of the two preceding ones. 


import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        
        int f1=0,f2=1,f3;
        System.out.print(f1 + " " + f2 + " ");
        for(int i=1; i<=n-2; i++){
                f3 = f1 + f2; 
                System.out.print(f3 + " ");
                f1 = f2;
                f2 = f3;
        }
    
    
    }
}