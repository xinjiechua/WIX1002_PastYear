package Exercise;

/* Write a Java program to read all the content from an input text file, convert all of
them into uppercase letters, and write the result into an output file. The output file
should be placed at the same folder as the input file. The input file is assumed to
contain only English letters, numbers and punctuation marks. */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class File {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new FileInputStream("sentence.txt"));
            PrintWriter os = new PrintWriter("sentence2.txt");
            int word=0;
            while(sc.hasNextLine()){
             String lines = sc.nextLine();
             os.println(lines.toUpperCase());
             word += lines.split(" ").length;
            } 
            System.out.println("Word" + word);
            os.close();
            sc.close();
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
    }
}
