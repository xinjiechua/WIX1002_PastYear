package Y2019_2;
import java.util.Random;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        char ans2;
        do{
        int num1 = r.nextInt(10);
        int num2 = r.nextInt(10);
        System.out.print("\nWhat is " + num1 + " + " + num2 + "? ");
        int ans = sc.nextInt();
        if(num1 + num2 == ans)
            System.out.println(num1 + " + " + num2 + " is true");
        else
            System.out.println(num1 + " + " + num2 + " is false");
        System.out.print("Do you want to try another question(y/n)? :");
            ans2 = sc.next().charAt(0);
            
            if(ans2 == 'n'){
                System.out.println("Program ends.");
                System.exit(0);
            }
        } while(ans2 == 'y');
    }
}
