
package Y2122.VIVA1;

/*Write a program to check whether a triangle is valid or invalid. If the triangle is valid,
check whether a triangle is Equilateral, Isosceles or Scalene.*/
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of each side of triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if((b + c) <= a || (a+c)<=b || (a+b)<=c){
            System.out.println("Invalid triangle");
        }
        else if(a==b && b==c)
            System.out.println("Equilateral triangle");
        else if(a!=b && b!=c && a!=c)
            System.out.println("Scalene triangle");
        else
            System.out.println("Isosceles triangle");
            
    }        
}
