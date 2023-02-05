
package Y2017_2;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class Q4 {
    
    public static void main(String[] args) {
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Q417.dat"));
            while(true){
                //String line = in.readUTF();
                int q = in.readInt(); //Integer.parseInt(line.substring(0,2));
                int m = in.readInt(); //Integer.parseInt(line.substring(2,4));
                int y = in.readInt(); //Integer.parseInt(line.substring(4));
                DayOfTheWeek d = new DayOfTheWeek(q,m,y);
                System.out.println(d);
            } 
        } catch (IOException e){
        }
    }
    
}
