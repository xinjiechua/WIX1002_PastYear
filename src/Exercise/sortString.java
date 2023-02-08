package Exercise;

import java.util.Arrays;
import java.util.Collections;

public class sortString {

    public static void main(String[] args) {
        //String
        String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};
        Arrays.sort(countries, Collections.reverseOrder());
        System.out.println(Arrays.toString(countries));

        //Char
        String str = "scaler";
        char array[] = str.toCharArray();
        Arrays.sort(array);
        str = new String(array);
        System.out.println(str);

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
        System.out.println();
        
        //Integer
        int[] num = {423, 543, 234, 76, 97};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        
        for (int i = 4; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
        System.out.println("");
        
        //String
        String[] words ={"You can do it","Goodluck","All the best","Smile"};
        String temp;
        for(int i=0; i<words.length;i++)
            for(int j=0; j<words.length-1; j++)
                if(words[j].compareTo(words[j+1])>0){
                    temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }
        System.out.println(Arrays.toString(words));
    }
}
