
package Exercise;

import java.util.Scanner;
public class transposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        int [][] matrix = new int [r][c];
        System.out.println("Enter the elements of matrix");
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }    
        
        System.out.println("Transpose of entered matrix:");
        int [][]tranpose = new int[c][r];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                tranpose[j][i] = matrix[i][j];
            }
        }
        
        for(int i = 0; i<c; i++){
            for(int j = 0; j<r; j++){
                System.out.print(tranpose[i][j] + " " );
            }
            System.out.println("");
        }
    }
}
