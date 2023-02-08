package Exercise;

//print first n prime numbers
import java.util.Scanner;

public class primeNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of prime numbers you want: ");
        int n = sc.nextInt();
        System.out.print("First " + n + " prime numbers are ");

        int count = 0, num = 2;
        while (count < n) {
            boolean status = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    status = false;
                    break;
                }
            }
            if (status) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        
    ///////////////////////////////
    
        System.out.print("\nEnter number of prime numbers you want: ");
        int n2 = sc.nextInt();
        System.out.print("First " + n2 + " prime numbers are ");
        int cnt = 0, number = 2;
        while (cnt < n2) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                cnt++;
            }
            number++;
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
        