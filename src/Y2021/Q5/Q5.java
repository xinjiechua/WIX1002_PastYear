package Y2021.Q5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers [1-9] : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        char[] sign = {'+', '-', '*', '/'};
        boolean solution = false;

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++) {
                //front first
                if (calc(sign[j], calc(sign[i], a, b), c) == 18) {
                    solution = true;
                    if (i < 2 && j > 1)  //first sign '+' or '-'
                        System.out.printf("(%d %c %d) %c %d = %d\n", a, sign[i], b, sign[j], c, 18);
                    else
                        System.out.printf("%d %c %d %c %d = %d\n", a, sign[i], b, sign[j], c, 18);
                }
                //behind first
                if (calc(sign[j], a, calc(sign[i], b, c)) == 18) {
                    solution = true;
                    if (i > 1 && j < 2)  //second sign '+' or '-'
                        System.out.printf("%d %c %d %c %d = %d\n", a, sign[j], b, sign[i], c, 18);
                    else
                        System.out.printf("%d %c (%d %c %d) = %d\n", a, sign[j], b, sign[i], c, 18);
                }
            }
        }
        if(!solution)
            System.out.println("No Solution");
    }

    public static double calc(char sign,double a, double b){
        switch(sign) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            default:
                return a / b;
        }
    }
}
