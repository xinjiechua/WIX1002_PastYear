package Y2022;
/*Random class is used to generate random numbers and characters. Write a Java program to perform the following task:
▪ Generate 3 random price values (100.00-300.00) and display the price values in two decimal places.
▪ Generate 5 random even-numbered years (1990-2030) and display the years.
▪ Generate 1 random car plate number and display the car plate number. The car plate number begin with 5 digits and end with two uppercase letters.
▪ Generate 1 random word and display the word. The word consists of maximum 8 characters and each character must be from a-z or A-Z*/

import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.print("3 random price values : ");
        for(int i=0; i<3;i++)
            System.out.printf("%.2f ",r.nextDouble() + r.nextInt(200)+100);

        System.out.print("\n5 random even-numbered years : ");
        int j=0;
        while(j<5){
            int rand = r.nextInt(41)+1990;   //max-min+1
            if(rand%2==0) {
                System.out.print(rand + " ");
                j++;
            }
        }

        System.out.print("\nCar Plate Number : ");
        System.out.print(r.nextInt(90000)+10000);
        System.out.print((char)(r.nextInt(26)+ 'A'));
        System.out.print((char)(r.nextInt(26)+ 'A'));

        System.out.print("\nRandom Word : ");
        int length = r.nextInt(8)+1;
        for(int i=0; i<length;i++){
            int choices=r.nextInt(2);
            if(choices == 1)
                System.out.print((char)(r.nextInt(26) + 'a'));
            else
                System.out.print((char)(r.nextInt(26) + 'A'));
        }
    }
}
