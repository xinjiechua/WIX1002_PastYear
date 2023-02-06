package y2018;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=0, format = 0;
        char type;
        System.out.print("Enter font size: ");
        size = sc.nextInt();
        System.out.print("Enter font type: ");
        type = sc.next().charAt(0);
        System.out.print("Enter format [1 - Vertical, 2 - Horizontal]: ");
        format = sc.nextInt();
        
        if(format==1){
            for(int i=0;i<size*2+3;i++){ //row
                for(int j=0;j<size+2;j++){ //column
                    if(i==0||i==size+1||i==size*2+2)
                        System.out.print(type);
                    else
                        if(j==0||j==size+1)
                            System.out.print(type);
                        else
                            System.out.print(" ");
                }System.out.println("");
            } 
        }else{
            for(int i=0;i<size+2;i++){ //row
                for(int j=0;j<size*2+3;j++){ //column
                    if(i==0||i==size+1)
                        System.out.print(type);
                    else
                        if(j==0||j==size+1||j==size*2+2)
                            System.out.print(type);
                        else
                            System.out.print(" ");
                }System.out.println("");
            } 
        }
    } 
    
}
