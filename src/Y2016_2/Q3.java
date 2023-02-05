
package Y2016_2;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=i; j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<(i*2);k++){
                int num = i-k+1;
                if(num<1)
                    num = Math.abs(num)+2;
                System.out.print(num);
            }
            System.out.println("");
        }
    } 
}
