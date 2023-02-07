package Y2019;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter genome string [quit to stop] : ");
            String s = sc.nextLine();
            if (s.equals("quit")) break;
            if (!s.contains("ATG") || (!s.contains("TAG") && !s.contains("TAA") && !s.contains("TGA"))){
                System.out.println("No gene is found");
                continue;   //break this loop
            }
            boolean hasGene = false;
            int start = s.indexOf("ATG");
            int n = s.length();
            while(start < n - 6 && start != -1){
                String res = "";
                for(int i=start+3; i<=n-3; i+=3){  //i=start+3 means the first letter of gene
                    if (matchedEnding(s.substring(i,i+3)) && qualified(res)){ //here i has increased by 3 so is checking the letters after gene
                        System.out.println(res);
                        hasGene = true;
                        break;
                    }else if (s.substring(i, i+3).equals("ATG")){
                        break;
                    }else res += s.substring(i,i+3);  //assign gene
                }
                start = s.indexOf("ATG", start+3);
                //find next starting ATG  (start+3 is used to avoid finding the same ATG again)
            }
            if (!hasGene) System.out.println("No gene is found.");
        }
    }
    public static boolean matchedEnding(String s){
        return s.equals("TAG") || s.equals("TAA") || s.equals("TGA");
    }
    public static boolean qualified(String s){
        return s.length() >= 3 && s.length() % 3 == 0 && !s.contains("ATG") && !s.contains("TAG") && !s.contains("TAA") && !s.contains("TGA");
    }

}

