
package Exercise;
//print prime numbers till N

import java.util.Scanner;
public class primeMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n=sc.nextInt();
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            } 
        }
    }
    
    public static boolean isPrime(int num){
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i == 0)
                return false;
        }
        return true;
    }
    
}
