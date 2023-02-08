package Y2018_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(new FileInputStream("Student.txt"));
            String[]record = new String[2];
            String names, maxName = " ", minName = " ";
            int marks, max = 0, min = 999, absent = 0;

            while (sc.hasNextLine()){
                for (int i = 0; i < record.length; i++) {
                    record = sc.nextLine().split(",");
                    names = record[0];
                    marks = Integer.parseInt(record[1]);
                    if (marks == -1) {
                        absent++;
                    } else if (marks > max) {
                        max = marks;
                        maxName = names;
                    } else if (marks < min) {
                        min = marks;
                        minName = names;
                    }
                }
            }

            System.out.println("The student with the highest mark: " + maxName + " "+ max);
            System.out.println("The student with the lowest mark: " + minName + " " + min);
            System.out.println("The number of student who were absent from the exam: " + absent);

        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
    }
}

        /*
         try {
            Scanner sc = new Scanner(new FileInputStream("Student.txt"));
            String[][] record = new String[10][2];
            String[] names = new String[10];
            int[] marks = new int[10];
            while (sc.hasNextLine()) {
                for (int i = 0; i < record.length; i++) {
                    record[i] = sc.nextLine().split(",");
                    names[i] = record[i][0];
                    marks[i] = Integer.parseInt(record[i][1]);
                }
            }
            int max = 0, min = 0, absent = 0;
            for (int i = 0; i < marks.length; i++) {
                if (marks[i] == -1) {
                    absent++;
                } else if (marks[i] > marks[max]) {
                    max = i;
                } else if (marks[i] < marks[min]) {
                    min = i;
                }
            }
            System.out.println("The student with the highest mark: " + names[max] + " "+ marks[max]);
            System.out.println("The student with the lowest mark: " + names[min] + " " + marks[min]);
            System.out.println("The number of student who were absent from the exam: " + absent);

             } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
        */




