package Y2019;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter genome string [quit to stop] : ");
        String genome = sc.next();
        String gene = "";
        int start = -1;

        while(!genome.equals("quit")) {

            for(int i=0; i<genome.length()-2; i++){
                String triplet = genome.substring(i,i+3);  //extract triplet

                if(triplet.equals("ATG"))
                    start = i+3;  //identify the start index of gene

                else if((triplet.equals("TAG")) || (triplet.equals("TAA"))||(triplet.equals("TGA")) && start!=-1){
                    //current triplet is the end of a gene
                    try{
                        gene = genome.substring(start,i);  //when triplet become TAG these sure i ady bigger than start at least 6
                    } catch(StringIndexOutOfBoundsException e){
                        continue;
                    }
                    if(gene.length()%3==0){
                        start = 0;  //reset to zero
                        System.out.println(gene);
                    }
                }
            }
            if(gene.equals(""))
                System.out.println("No gene is found");
            System.out.print("Enter genome string [quit to stop] : ");
            genome = sc.next();
        }
    }
}
