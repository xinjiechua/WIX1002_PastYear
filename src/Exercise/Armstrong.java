
package Exercise;

import java.util.Scanner;
//Armstrong number is a number equal to the sum of digits raise to the power total number of digits in the number

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, temp, digit=0,remainder,sum=0;
        
        System.out.println("Input a number to check if it is an Armstrong number");
        n = sc.nextInt();
        temp = n;
        
        while(temp!=0){
            temp/=10;
            digit++;
        }
        
        temp = n;
        while(temp!=0){
            remainder = temp%10;
            sum += Math.pow(remainder,digit);
            temp /=10;
        }
        
        if(n==sum)
            System.out.println(n + " is an armstrong number");
        else
            System.out.println(n + " is not an armstrong number");
    }
    
}
