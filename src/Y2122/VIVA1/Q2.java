
package Y2122.VIVA1;
/*
Write a program to generate two cards randomly and display the bigger card between
them. The cards contain of two characteristic, color (Red, Blue, Green and Yellow)
and value (1-10). The rules to identify the bigger card as below:
a. The bigger the value, the bigger the card is, except 1 is bigger than 10.
b. If the card is the same value, the color will be used to get the bigger card
Red > Blue> Green >Yellow
*/

import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Random r = new Random();
        String colour1=" ", colour2=" ";
        int card1 = r.nextInt(4);
        switch(card1){
            case 0: 
                colour1 = "Red"; 
                break;
            case 1: 
                colour1 = "Blue"; 
                break;
            case 2: 
                colour1 = "Green"; 
                break;
            case 3: 
                colour1 = "Yellow"; 
                break;
        }
        
        int num1 = r.nextInt(10)+1;
        
        int card2 = r.nextInt(4);
        switch(card2){
            case 0: 
                colour2 = "Red"; 
                break;
            case 1: 
                colour2 = "Blue"; 
                break;
            case 2: 
                colour2 = "Green"; 
                break;
            case 3: 
                colour2 = "Yellow"; 
                break;
        }
        
        int num2 = r.nextInt(10)+1;
        
        System.out.println("Card 1 : " + colour1 + " " + num1);
        System.out.println("Card 2 : " + colour2 + " " + num2);
        
        
        if(num1>num2)
            System.out.println("Card 1 is bigger");
        else if(num1 == num2){
            if(card1 < card2)
                System.out.println("Card 1 is bigger");
            else
                System.out.println("Card 2 is bigger");
        }
        else
            System.out.println("Card 2 is bigger");
            
    }
            
}
