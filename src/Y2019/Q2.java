package Y2019;

import java.util.Random;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int N = sc.nextInt();
        int[][] matrix1 = new int[N][N];
        int[][] matrix2 = new int[N][N];
        generate(matrix1);
        generate(matrix2);
        System.out.println("Matrix A");
        display(matrix1);
        System.out.println("Matrix B");
        display(matrix2);
        System.out.println("Matrix A + B");
        display(add(matrix1,matrix2));
        System.out.println("Matrix A x B");
        display(multiply(matrix1,matrix2));
    }

    public static void generate(int[][]matrix){
        Random r = new Random();
        for(int i=0; i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j] = r.nextInt(10);
            }
        }
    }

    public static void display(int[][]matrix){
        for(int i=0; i<matrix.length;i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][]add(int[][]matrix1, int[][]matrix2){
        int[][]result= new int[matrix1.length][matrix1[0].length];
        for(int i=0; i<matrix1.length;i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        } return result;
    }

    public static int[][]multiply(int[][]matrix1, int[][]matrix2){
        int[][]result= new int[matrix1.length][matrix2[0].length];
        for(int i=0; i<matrix1.length;i++){
            for(int j=0;j<matrix2[i].length;j++){
                for(int k=0;k<matrix1[i].length;k++){
                    result[i][j] += matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        return result;
    }

}
