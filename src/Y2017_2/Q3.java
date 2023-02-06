
package Y2017_2;

import java.util.Scanner;
import java.util.Random;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of random integer: ");
        int n = sc.nextInt();
        int[] num = new int[n];
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            num[i] = r.nextInt(10001);
        }
        display(num);
        getMin(num);
        approx(num);
        reverse(num);

    }

    public static void display(int[] num) {
        System.out.print("The random integer : ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void getMin(int[] num) {
        int min = 0;
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] < num[min]) {
                min = i;
            }
        }
        System.out.println("\nMinimum Number : " + num[min]);
    }

    public static void approx(int[] num) {
        System.out.print("The approximation of the integer to the nearest hundred : ");
        for (int i = 0; i < num.length; i++) {
            System.out.print((num[i] / 100) * 100 + " ");
        }
    }

    public static void reverse(int[] num) {
        System.out.print("\nThe random integer in reverse order: ");
        for (int i = 0; i < num.length; i++) {
            int rev=0;
            while (num[i] != 0) {
                int r = num[i] % 10;
                rev = rev * 10 + r;
                num[i] /= 10;
            }
            num[i]=rev;
            System.out.print(num[i] + " ");
        }
    }
}
