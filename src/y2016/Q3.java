package y2016;
import java.util.Scanner;
import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter the number of random integer: ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = r.nextInt(1001);
        }
        display(arr);
        max(arr);
        round(arr);
        reverse(arr);
    }    
  
    public static void display(int[]arr){
        System.out.print("The random integer :");
        for(int i : arr)
            System.out.print(i + " ");
    }
    
  
    public static void max(int[]arr){
        int max = 0;
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]> arr[i+1])
                max = arr[i];
        }
        System.out.println("\nMaximum Number : " + max);
        //Arrays.sort(arr);
        //int last = arr.length-1;
        //System.out.println("\nMaximum Number: " + arr[last]);
    }    
    
    public static void round(int[]arr){
        System.out.print("The approximation of the integer to the nearest tenth :");
        for(int i=0; i<arr.length; i++){
            System.out.print((arr[i]/10)*10 + " ");
        }
    }
    
    public static void reverse(int [] arr){
        System.out.print("\nThe random integer in reverse order: ");
        for(int i=0; i<arr.length;i++){
            int reverse = 0;
            while(arr[i] != 0){
                int remainder = arr[i] % 10; 
                reverse = reverse*10 + remainder; 
                arr[i] /= 10; 
            }
            arr[i] = reverse;
            System.out.print(arr[i] + " ");
        }
    }
}

