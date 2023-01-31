package Y2022;
import java.util.Arrays;
public class Diving {

    private String name, country;
    private double[][] scores;
    private double[] rating;

    public Diving(String name, String country, double[][] scores, double[] rating) {
        this.name = name;
        this.country = country;
        this.scores = scores;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public double getFinalScore() {
        double result = 0;
        for (int i = 0; i < scores.length; i++) {
            Arrays.sort(scores[i]);
            double score = 0;
            for (int j = 2; j < scores[i].length - 2; j++)
                score += scores[i][j];
            score *= rating[i];
            result += score;
        }
        return result;
    }

    public String toString(){
        StringBuilder str = new StringBuilder("");
        for(int i=0;i<scores.length;i++){
            str.append("Judges Scores : ");
            for(int j=0; j<scores[i].length; j++){
                str.append(scores[i][j]).append(" ");
            }
            str.append("\nDifficulty Rating : ").append(rating[i]).append("\n");
        }
        return String.format("Diver : %s (%s)\n" + "%s" + "Final Score : %.2f",name,country, str,getFinalScore());
    }
}
