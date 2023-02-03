package y2018;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Arrays;
public class Q4 {
    public static void main(String[] args) {
        String winner = "";
        double max = 0;
        DecimalFormat df = new DecimalFormat("#.##");
        try{
        Scanner sc = new Scanner(new FileInputStream("Q4.txt"));
        while(sc.hasNextLine()){
            double [] scores = new double[5];
            double total = 0;
            int difficulty;
            
            String[]col = sc.nextLine().split(" ");
        
            for(int i=0; i<scores.length;i++){
                scores[i] = Double.parseDouble(col[i+1]);
            }
            Arrays.sort(scores);
            difficulty = Integer.parseInt(col[col.length-1]);
            
            for(int i=1; i<scores.length-1;i++){
                total += scores[i];
            }
            total*= difficulty;
            
            if(total > max){
                max = total;
                winner = col[0];
            }
            System.out.println(col[0] + " score " + df.format(total));
        }
        sc.close();
        System.out.println(winner + " is the winner");
        
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
    }
}
