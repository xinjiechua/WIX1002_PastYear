package Y2021.Q4;

import java.io.IOException;

public class DivideF1 extends Eleven {

    public DivideF1(String file) throws IOException {
        super(file);
    }

    @Override
    public String divide(){
        StringBuilder str = new StringBuilder("");
        str.append("Divisibility Rule (Formula 1)\n");

        for(int num : arr){
            boolean divisible = false;
            int left = 0, right = 0, i=0, j=0, seq=0;
            int [] leftNum = new int [6];
            int [] rightNum = new int[6];
            int temp = num;

            str.append(num).append(" : |x| = | (");

            while(temp > 0){
                int digit = temp % 10;
                temp/=10;
                if(seq++ % 2 == 0){
                    leftNum[i++] = digit;
                    left += digit;
                } else {
                    rightNum[j++] = digit;
                    right += digit;
                }
            }
            int abs = Math.abs(left-right);
            if(abs%11==0)
                divisible = true;

            for(i-=1;i>0;i--)
                str.append(leftNum[i]).append(" + ");
            str.append(leftNum[0]).append(") - (");
            for(j-=1;j>0;j--)
                str.append(rightNum[j]).append(" + ");
            str.append(rightNum[0]).append(") | = ").append(abs);

            if(divisible)
                str.append("\n").append(abs).append(" modulus 11 = 0, ").append(num).append("is divisible by 11\n\n");
            else
                str.append("\n").append(abs).append(" modulus 11 is not equal 0, ").append(num).append("is not divisible by 11\n\n");

        }
        return str.toString();
    }
}
