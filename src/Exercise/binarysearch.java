package Exercise;

import java.util.Scanner;

public class binarysearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        System.out.println("Rnter 5 integers");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Enter value to find");
        int search = sc.nextInt();
        int low = 0;
        int high = n - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            if (num[mid] < search) {
                low = mid + 1;
            } else if (num[mid] == search) {
                System.out.println(search + " found at location " + (mid + 1));
                break;
            } else {
                high = mid - 1;
            }
        }
        if(low > high){
            System.out.println(search + "is not present in the list");
        }
    } 
}
