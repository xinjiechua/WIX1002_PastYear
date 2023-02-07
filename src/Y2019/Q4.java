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
                text.append(line).append(" ");
            }
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }

        String text2 = text.toString().replace("  "," ");

        int sentence = text2.split("\\.").length;
        System.out.println("\nNumber of sentences : " + sentence);

        int word = text2.split(" ").length;
        System.out.println("\nNumber of words : " + word);


        for(int i=0; i<text2.length();i++){
            for(int j=0; j< alphabet.length;j++) {
                String letter = String.valueOf(text2.charAt(i));
                if (letter.compareToIgnoreCase(String.valueOf(alphabet[j])) == 0)
                    count[j]++;
            }
        }

        for(int i=0; i<alphabet.length;i++) {
            System.out.print(alphabet[i] + " : " + count[i] + " ");
            if(i%7==0 && i!= 0)
                System.out.println();
        }
    }
}
