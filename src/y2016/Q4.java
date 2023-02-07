package y2016;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        
        try{
            Scanner sc = new Scanner(new FileInputStream("Q4_2016.txt"));
            while(sc.hasNextLine()){
                 String pw = sc.nextLine();    
                 boolean strong = check(pw);
                 if(strong)
                     System.out.println("Strong password");
                 else
                     System.out.println("Not a strong password"); 
            }
            sc.close();
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
    }    
    
    public static boolean check(String pw){
         boolean length = pw.length()>=8;
         boolean upper = false, lower = false, digit = false, special = false;
         for(int i=0; i<pw.length();i++){
             char c = pw.charAt(i);
             if(c >= 'A' && c <= 'Z')
                 upper = true;
             else if( c >= 'a' && c <= 'z')
                 lower = true;
             else if(c >= '0' && c <= '9')
                 digit = true;
             else if(c != ' ')
                 special = true;
         }
         return length && upper && lower && digit && special;
            
            
    }
        
      
        
    
}
