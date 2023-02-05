package Y2016_M;

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min=0,cnt=0;
        System.out.print("Enter Integer (-1 to quit) : ");
        int num = sc.nextInt();
        
        if(num!=-1)
            min = num;
        
        while(num!=-1){
             System.out.print(num + " ");
             if(min>num){
                   min = num;
                   cnt = 1;
             } else if (min == num)
                 cnt++;
            num = sc.nextInt();
            if(num == -1)
                break;
        }
        
        System.out.println("\nThe minimum number is " + min);
        System.out.println("The occurence count of " + min + " is " + cnt);
    }
}
