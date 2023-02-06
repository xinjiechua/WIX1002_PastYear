
package Y2019_2.Q5;
import java.util.Scanner;
class Q5Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values of a,b and c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The equation is : " + a +"x(^2)+(" + b +")x + (" + c + ")");
        QuadraticEq e = new QuadraticEq(a,b,c);
        System.out.println("Discriminant: " + e.Discriminant());
        if(e.Discriminant()>0)
            System.out.println("The roots: " + e.calcRoot1() + " and " + e.calcRoot2());
        else if(e.Discriminant()<0)
            System.out.println("The equation has no roots");
        else 
            System.out.println("Same roots: " + (-b/2*a));
             
    }   
}
