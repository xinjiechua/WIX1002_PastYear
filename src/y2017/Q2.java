package y2017;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial tuition fee (i.e year 1):");
        int fee = sc.nextInt();
        System.out.print("Enter the yearly rate of increment (e.g enter 5.2 for 5.2%):");
        double rate = sc.nextDouble();
        System.out.print("Enter the yeaer for which you wish to compute the tuition fee for: ");
        int year = sc.nextInt();
        
        System.out.printf("\nComputed tuition fee for year %d is: %.2f",year,computeFee(fee,rate,year));
    }
    
    public static double computeFee(double fee, double rate, int year){
         return fee*Math.pow(rate/100+1,year-1);
    }
}
