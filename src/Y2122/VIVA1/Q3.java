package Y2122.VIVA1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quadratic equation: ");
        String eq = sc.nextLine();
        
        eq = eq.replace("-","+-");   //"2x2+-3x+6"
        
        String[]arr = eq.split("\\+"); //{2x2, -3x, 6}

        String A, B, C;     
        if(arr[0].length()==2)
            A="1";
        else 
            A = arr[0].substring(0,arr[0].indexOf("x"));
        System.out.println(A);
        
        if(arr[1].length()==1)
            B="1";
        else 
            B = arr[1].substring(0,arr[1].indexOf("x"));
        System.out.println(B);
        
        C = arr[2];
        System.out.println(C);
        
        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);
        int c = Integer.parseInt(C);

        double x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
        double x2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
        double formula = b*b-4*a*c;
        
        if(formula < 0){
            System.out.println("The quadratic equation has 0 root(s).\nNo solution");
        }    
        else if(formula == 0){
            System.out.println("This quadratic equation has 1 root(s).\nx = " + x1);
        }
        else
            System.out.println("This quadratic equation has 2 root(s).\nx = " + x1+"\nx = " + x2);
            
                    
        
    }
}
