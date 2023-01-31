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
            sc.close();

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

            //sort
            for(int i=0;i<recordNo;i++){
                for(int j=0; j<recordNo-1;j++){
                    if(diver[j].getFinalScore() < diver[j+1].getFinalScore()){
                        Diving temp = diver[j];
                        diver[j] = diver[j+1];
                        diver[j+1] = temp;
                    }
                }
            }

            System.out.printf("Gold : %s (%s) \n",diver[0].getName(), diver[0].getCountry());
            System.out.printf("Silver : %s (%s) \n",diver[1].getName(), diver[1].getCountry());
            System.out.printf("Bronze : %s (%s) \n",diver[2].getName(), diver[2].getCountry());

        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
    }
}
