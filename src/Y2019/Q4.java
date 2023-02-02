package Y2019;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        char[]alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P',
                'Q','R','S','T','U','V','W','X','Y','Z'};
        int []count = new int[26];

        StringBuilder text = new StringBuilder();
        System.out.println("The essay is :");
        try{
            Scanner sc = new Scanner(new FileInputStream("myAmbition.txt"));
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
                text.append(line);
            }
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }

        String[]sentence = text.toString().split("[.]");
        System.out.println("Number of sentences : "+ sentence.length);

        String[]words = text.toString().split(" ");
        System.out.println("Number of words : " + words.length);

        for(int i=0; i<text.length();i++){
            String letter = String.valueOf(text.charAt(i));
            for(int j=0; j< alphabet.length;j++)
                if(letter.compareToIgnoreCase(String.valueOf(alphabet[j]))==0)
                    count[j]++;
        }

        for(int i=0; i<alphabet.length;i++) {
            System.out.print(alphabet[i] + " : " + count[i] + " ");
            if(i%7==0 && i!= 0)
                System.out.println();
        }
    }
}
