
package Y2122.VIVA2;
/*Write a Java method that accepts an integer as parameter and returns 
a string as an expression of the sum of powers of 2 in increasing order.
(Non-duplicate)
*/
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sumOfPowersOfTwo(num));
    }
          
   public static String sumOfPowersOfTwo(int n) {
    StringBuilder sb = new StringBuilder();
    int i = 0;   //exponent(power of 2)
    while (n > 0) {
        if ((n & 1) == 1) {   
            if (sb.length() > 0) { //check if sb ady contains characters
                sb.append(" + ");
            }
            sb.append((int)Math.pow(2, i));
        }
        i++;
        n >>= 1;  
    }
    return sb.toString();
}        
}

/* 
if ((n & 1) == 1) {     check if LSB is set (equal to 1) using bitwise '&' operatior (AND)
                        if LSB is set means that exponent is included in sum

n >>= 1;                shift one bit of n to right using bitwise right shift operator

20 = 2^2 + 2^4 = 10100



*/