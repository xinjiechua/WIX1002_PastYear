package Y2021.Q4;

import java.io.IOException;

public class DivideF2 extends Eleven{

    public DivideF2(String file) throws IOException {
        super(file);
    }

    @Override
    public String divide(){
        StringBuilder str = new StringBuilder("");
        str.append("Divisibility Rule (Formula 2)\n");
        for(int num : arr) {
            int temp = num;

            str.append(num).append(", : ");

            while (temp >= 100) {
                int digit = temp % 10;
                temp /= 10;
                str.append(temp).append(" - ").append(digit).append(" * 1 = ").append(temp - digit).append(", ");
                temp -= digit;
            }
            str.append("x = ").append(temp).append("\n");
            if (temp % 11 == 0)
                str.append(temp).append(" modulus 11 = 0, ").append(num).append(" is divisible by 11\n\n");
            else
                str.append(temp).append(" modulus 11 is not equal to 0, ").append(num).append("is not divisible by 11\n\n");
        }
        return str.toString();
    }
}
