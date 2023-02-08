package Exercise;

import java.util.Scanner;

public class addMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];
        System.out.println("Enter the elemenets of first matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        System.out.println("Enter the elemenets of second matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix2[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        System.out.println("Sum of entered matrices:-");
        int[][] matrixr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrixr[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(matrixr[i][j]+"\t");
            }
            System.out.println("");
        }
        
    }
}
