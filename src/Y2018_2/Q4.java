
package Y2018_2;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values for a,b,c,d,e and f: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        
        LinearEquation eq = new LinearEquation(a,b,c,d,e,f);
        System.out.println(eq);
        System.out.println("\nx = " + eq.computeX() + "; y = " + eq.computeY());
        
    }
    
}
