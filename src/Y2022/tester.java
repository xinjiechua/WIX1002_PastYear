package Y2022;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new FileInputStream("diving.txt"));
            int lines = 0;
            while(sc.hasNextLine()){
                lines ++;
                sc.nextLine();
            }
            int recordNo = lines/5;
            /* or
            while (sc.hasNextLine()) {
                for (int i = 0; i < 5; i++) {
                    sc.nextLine();
                }
                cnt++;
            }
             */

            Diving [] diver = new Diving[recordNo];
            sc = new Scanner(new FileInputStream("diving.txt"));
                for (int i = 0; i < recordNo; i++) {
                    String name = sc.nextLine();
                    String country = sc.nextLine();
                    double[][] scores = new double[3][7];
                    double[] rating = new double[3];
                    for (int j = 0; j < 3; j++) {
                        for (int k = 0; k < 7; k++)
                            scores[j][k] = sc.nextDouble();
                        rating[j] = sc.nextDouble();
                    }
                    diver[i] = new Diving(name, country, scores, rating);
                    if (i != recordNo - 1) sc.nextLine(); //read next line if not last element
                }
            sc.close();
            for(Diving d: diver)
                System.out.println(d.toString() + "\n");
            display(diver);

        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
    }

    public static void display(Diving[] d) {
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length - 1; j++) {
                if (d[j].getFinalScore() < d[j + 1].getFinalScore()) {
                    Diving temp = d[j];
                    d[j] = d[j + 1];
                    d[j + 1] = temp;
                }
            }
        }
        System.out.println("Gold : " + d[0].getName() + " (" + d[0].getCountry() + ")");
        System.out.println("Silver : " + d[1].getName() + " (" + d[1].getCountry() + ")");
        System.out.println("Bronze : " + d[2].getName() + " (" + d[2].getCountry() + ")");
    }
}
