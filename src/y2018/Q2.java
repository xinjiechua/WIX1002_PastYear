package y2018;

import java.util.Scanner;
import java.util.Random;
public class Q2 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N number: ");
        int n = sc.nextInt();
        System.out.print("The random numbers are: ");
        int [] num = new int[12]; 
        int aaa = 0,aa =0,a=0;
        
        for(int i=0; i<n;i++){
            num[i] = r.nextInt(100)+50;
            System.out.print(num[i] + " ");
            if(num[i]%10<=3)
                aaa++;
            else if(num[i]%10<=6)
                aa++;
            else
                a++;
        }
        System.out.println("\nGroup AAA :" + aaa);
        System.out.println("Group AA :" + aa);
        System.out.println("Group A :" + a);
    }
    
}
