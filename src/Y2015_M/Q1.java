/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2015_M;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the coordinate X and Y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.print("Enter the move: ");
        sc.nextLine();
        String line = sc.nextLine();
        char[] direction = new char[line.length()];
        for (int i = 0; i < line.length(); i++) {
            direction[i] = line.charAt(i);
        }

        System.out.println("Initial Coordinate (" + x + "," + y + ")");
        for (int i = 0; i < direction.length; i++) {
            switch (direction[i]) {
                case 'L':
                    x -= 1;
                    break;
                case 'R':
                    x += 1;
                    break;
                case 'U':
                    y += 1;
                    break;
                case 'D':
                    y -= 1;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Final Coordinate (" + x + "," + y + ")");
    }

}
