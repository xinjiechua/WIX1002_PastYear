
package Y2018_M;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (-1 to quit) :");
        int num = sc.nextInt();
        int cnt = 0, n=0;
        while(num != -1){
            System.out.print("Enter a factor : ");
            int factor = sc.nextInt();
            System.out.print(factor + " is a factor of " + num + "? (true/false) : ");
            String ans = sc.next();
            if(num%factor == 0){
                if(ans.equals("true")){
                    System.out.println("Your answer is correct");
                    cnt++;
                }else
                    System.out.println("Your answer is incorrect");
            }else{
                if(ans.equals("false")){
                    System.out.println("Your answer is correct");
                    cnt++;
                }else
                    System.out.println("Your answer is incorrect");
            }    
            n++;
            System.out.print("Enter a number (-1 to quit) :");
            num = sc.nextInt();
        }
        System.out.println("The final score is " + cnt + "/" + n); 
    }
}
