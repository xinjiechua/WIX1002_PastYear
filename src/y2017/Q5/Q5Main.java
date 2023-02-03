
package y2017.Q5;
import java.util.Scanner;
public class Q5Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks for Grammar (maximum 30 marks): ");
        int grammar = sc.nextInt();
         System.out.print("Enter the marks for Spelling (maximum 30 marks): ");
        int spelling = sc.nextInt();
         System.out.print("Enter the marks for Length (maximum 30 marks): ");
        int length = sc.nextInt();
         System.out.print("Enter the marks for Content (maximum 30 marks): ");
        int content = sc.nextInt();
        
        Essay e = new Essay(grammar,spelling, length, content);
        System.out.println("");
        System.out.println(e);
        
        int total = grammar + spelling + length + content;
        GradedActivity g = new GradedActivity();
        g.setScore(total);
        System.out.println("");
        System.out.println(g);
    }
    
}
