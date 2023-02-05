package Y2019_2;

public class Q1 {
    public static void main(String[]args){
        int[]num ={66,15,20,27,74,33};
        int cnt =0;
        for(int k=0; k<num.length; k++)
            if(isEven(num[k]))
                cnt++;
        System.out.println("The number of even integers is " + cnt);
        System.out.println("The biggest integer is " + findMax(num));
    }
    
    public static boolean isEven(int a){
        if(a%2 == 0)
            return true;
        else
            return false;
    }
    
    public static int findMax(int[]a){
        int max = a[0];
        for(int n=0; n<a.length; n++)
            if(a[n] > max)
                max = a[n];
        return max;
    }
    
}
