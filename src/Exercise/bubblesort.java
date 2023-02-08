
package Exercise;

import java.util.Scanner;
public class bubblesort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input number of integers to sort");
        int n=sc.nextInt();
        System.out.println("Enter 5 integers");
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sc.nextLine();
        }
        
        for (int i=0; i<n; i++)
            for(int j=0; j<n-1;j++)
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        System.out.println("Sorted list of numbers");
         for (int i=0; i<n; i++){
             System.out.println(arr[i]);
         }
    }
            
            
}
