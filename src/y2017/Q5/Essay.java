package y2017.Q5;

public class Essay extends GradedActivity{
    int grammar, spelling, length, content;
    
    public Essay(int grammar, int spelling, int length, int content){
        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
    }
    
    public String toString(){
        return "Essay score: " + "\nGrammar: " + grammar + "\nSpelling: " + spelling +
              "\nLength: " + length + "\nContent:" + content;  
   
    }
        
}
