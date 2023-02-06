package y2017.Q4;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First complex number. Enter a number for the real part:");
        double a = sc.nextDouble();
        System.out.print("First complex number. Enter a number for the imaginary part:");
        double b = sc.nextDouble();
        System.out.print("Second complex number. Enter a number for the real part:");
        double c = sc.nextDouble();
        System.out.print("Second complex number. Enter a number for the imaginary part:");
        double d = sc.nextDouble();
        
        Complex c1 = new Complex(a,b);
        Complex c2 = new Complex(c,d);
        
        System.out.println("\nFirst complex number: " + c1.toString());
        System.out.println("Second complex number: " + c2.toString());
        Complex result = c1.addComplexNum(c2);
        System.out.println("Addition of the two complex number: " + result.toString());
        result = c1.subtractComplexNum(c2);
        System.out.println("Substraction of the complex number: " + result.toString());

    }
}
