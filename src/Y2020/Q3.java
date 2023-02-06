package Y2020;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q3 {
    public static void main(String[]args){
        try {
            Scanner sc = new Scanner(new FileInputStream("raw.txt"));
            int[] count = new int[11];
            while (sc.hasNextInt()) { //**
                int num = sc.nextInt();
                count[num]++;
            }
            System.out.println("Frequency Distribution Table");
            int max = 0, mode = 0;
            for(int i=2; i<=10; i+=2){
                    System.out.print(i + " : " + count[i] + "\n");
                if(count[i]>max) {
                    max = count[i];
                    mode = i;
                }
            }
            System.out.println("The mode of the dataset is : " + mode);
        }catch(FileNotFoundException e){
            System.out.println("File was not found.");
        }
    }
}
