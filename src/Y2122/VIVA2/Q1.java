
package Y2122.VIVA2;
import java.util.Arrays;
public class Q1 {
    public static void main(String[] args) {
        int [] arr1 = {14,3,5,6,1,2,33};
        int [] arr2 = {4,5,2,24,231,1,2,9};
        System.out.println(getMedian(arr1));
        System.out.println(getMedian(arr2));
    }
    
    public static double getMedian(int [] arr){
        Arrays.sort(arr);
        int i;
        if(arr.length % 2 != 0){
            i = (arr.length+1)/2;
            return (double)arr[i-1];
        } else{
            i = arr.length/2;
            return (double)(arr[i]+arr[i-1])/2;
        }
    } 

}
