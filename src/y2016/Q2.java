package y2016;

import java.util.Scanner;
import java.util.Random;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scorep = 0, scorec = 0;

        

        while (scorep <3 && scorec <3) {
            System.out.print("Enter 1.Paper 2.Scissor 3.Rock: ");
            int input1 = sc.nextInt();
            
            Random r = new Random();
            int input2 = r.nextInt(3) + 1;
            System.out.println("Player : " + get(input1) + " ----- Computer : " + get(input2));

            if ((input1 == 3 && input2 == 2) || (input1 == 2 && input2 == 1) || (input1 == 1 && input2 == 3)) {
                scorep++;
                System.out.println("Player win " + scorep + " time(s)");
            } else if ((input1 == 3 && input2 == 1) || (input1 == 1 && input2 == 2) || (input1 == 2 && input2 == 3)) {
                scorec++;
                System.out.println("Computer win " + scorec + " time(s)");
            }
        }
        
        if (scorep == 3) {
            System.out.println("Player wins the game");
        } else if (scorec == 3) {
            System.out.println("Computer wins the game");
        }
    }

    public static String get(int num) {
        switch (num) {
            case 1:
                return "Paper";
            case 2:
                return "Scissor";
            case 3:
                return "Rock";
            default:
                return "Invalid";
        }
    }
}
