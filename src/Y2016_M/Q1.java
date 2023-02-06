package Y2016_M;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nine digit integer : ");
        int num = sc.nextInt();
        System.out.print("10-digit ISBN : " );
        System.out.print(num/100000000);
        System.out.print("-");
        System.out.print((num/100000)%1000);
        System.out.print("-");
        System.out.print(num%10000);
        System.out.print("-");
        
        int sum=0;
        for(int i=9; i>=1;i--){
            sum += ((num%10)*i);
            num/=10;       
        }
        if((sum%11)==10)
            System.out.print("X");
        else
            System.out.print(sum%11);    
        System.out.println();
    }
}
   
