
package Exercise;

/* A program to find all substrings of a string and prints them.
 */
import java.util.Scanner;
public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.print("Substrings of string " + str + " are: ");
        
        for(int i=0;i<str.length();i++){    
            for(int j=1; j<str.length() - i; j++){
                String sub = str.substring(i,i+j);
                System.out.print(sub + " ");
            }
        }
        
        String word = "fun";
        System.out.println(word.substring(0,0));
    }
    
}
