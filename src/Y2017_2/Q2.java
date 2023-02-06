package Y2017_2;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of teams:");
        int num = sc.nextInt();
        String[]team = new String[num];
        int []scores = new int[num];
        
        for(int i=0; i<team.length;i++){
            sc.nextLine();
            System.out.print("Enter team " + (i+1) + " name:");
            team[i] = sc.nextLine();
            System.out.print("Enter team " + (i+1) + " score:");
            scores[i] = sc.nextInt();
        }
        
        //**
        for(int i=0; i<scores.length;i++){  
            for(int j=0; j<scores.length-1;j++){
                if(scores[j] < scores[j+1]){
                  
                    int temp = scores[j];
                    scores[j] = scores[j+1];
                    scores[j+1] = temp;
            
                    String temp1 = team[j];
                    team[j]= team[j+1];
                    team[j+1] = temp1;
                }
            }
        }
        
        
        System.out.println("List of team with the highest team score first");
        for(int i=0; i<scores.length;i++){
                System.out.print(team[i]+ " (" + scores[i] + ") |");
        }
    }    
}
