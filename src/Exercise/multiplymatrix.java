
package Exercise;

import java.util.Scanner;
public class multiplymatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and colums of first matrix");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int [][] matrix1 = new int[r1][c1];
        
        System.out.println("Enter the elemenets of first matrix");
        for(int i=0; i<r1;i++){
            for(int j=0; j<c1; j++){
                matrix1[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }    
        
        System.out.println("Enter the number of rows and colums of first matrix");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int [][] matrix2 = new int[r1][c1];
        
        System.out.println("Enter the elemenets of first matrix");
        for(int i=0; i<r2;i++){
            for(int j=0; j<c2; j++){
                matrix2[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }    
        
      
        if(c1 != r2){
            System.out.println("Matrices entered can't be multiplied with each other");
            return;   //exit program
        }   
        
        System.out.println("Product of entered matrices: -");  
        int[][]result = new int [r1][c2];
        for(int i=0; i<r1;i++){
            for(int j=0; j<c2; j++){
                for(int k=0; k<c1; k++){   //add one more c1
                result[i][j] += matrix1[i][k]*matrix2[k][j];  // += ***
                }
            }
        }
        for(int i=0; i<r1;i++){
            for(int j=0; j<c2; j++){
                  System.out.print(result[i][j] + " "); 
            }
            System.out.println("");
        }    
            
    }
}
