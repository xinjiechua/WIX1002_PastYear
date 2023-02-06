package Y2016_2;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000:");
        int num = sc.nextInt();
        int sum = num%10 + (num/10)%10 + num/100;
        System.out.println("The sum of the digits is " + sum);
    }
}
