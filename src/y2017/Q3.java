package y2017;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        try {
            PrintWriter os = new PrintWriter(new FileOutputStream("data.txt"));
            Random r = new Random();
            int num = 0;
            System.out.print("The string generated is: ");
            for (int i = 0; i < 6; i++) {
                num = r.nextInt(58) + 65;
                if ((num >= 65 && num <= 90 )||( num >= 97 && num <= 122)) {
                    System.out.print((char) num);
                    os.print((char) num);
                } else {
                    i--; //Remove non-alphabet
                }
            }
            System.out.println( );
            os.close();
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }

        try {
            Scanner sc = new Scanner(new FileInputStream("data.txt"));
            String line = sc.nextLine();
           
            char[] array = new char[6];     
            for (int i = 0; i < line.length(); i++) {
                array[i] = line.charAt(i); //store data into char array
            } 
            sort(array, '>');
            System.out.print("String sorted in ascending order: ");
            display(array);
            sort(array, '<');
            System.out.print("String sorted in descending order: ");
            display(array);
            System.out.println("Original string from file: " + line);

            sc.close();
        } catch (IOException e) {
            System.out.println("Error reading from file");
        }
    }

    public static void sort(char[] arr, char seq) {
        if (seq == '>') {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    char temp;
                    if ((int) arr[j] > (int) arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    char temp;
                    if ((int) arr[j] < (int) arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[i + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }

    public static void display(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

}
