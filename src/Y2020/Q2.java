package Y2020;
import java.util.Scanner;
public class Q2 {

    static int[][] location1 = new int [2][4], location2 = new int [2][4];
    static char[] direction = new char[4];
    static double[] degree1 = new double[2],  degree2 = new double[2];

    public static void main(String[] args) {
        getInput();
        convert(direction);
        System.out.printf("Location 1 : %.6f Latitude , %.6f Longitude \n",degree1[0],degree1[1]);
        System.out.printf("Location 2 : %.6f Latitude , %.6f Longitude\n",degree2[0],degree2[1]);
        System.out.printf("Distance: %.2f KM",calc());
    }

    public static void getInput(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Location 1");
        System.out.print("Enter Direction: [N,S,E,W]: ");
        direction[0] = sc.next().charAt(0);
        System.out.print("Enter Degree, Minute and Second : ");
        for(int i=0; i<3;i++)
            location1[0][i] = sc.nextInt();
        System.out.print("Enter Direction: [N,S,E,W]: ");
        direction[1] = sc.next().charAt(0);
        System.out.print("Enter Degree, Minute and Second : ");
        for(int i=0; i<3;i++)
            location1[1][i] = sc.nextInt();

        System.out.println("Enter Location 2");
        System.out.print("Enter Direction: [N,S,E,W]: ");
        direction[2] = sc.next().charAt(0);
        System.out.print("Enter Degree, Minute and Second : ");
        for(int i=0; i<3;i++)
            location2[0][i] = sc.nextInt();
        System.out.print("Enter Direction: [N,S,E,W]: ");
        direction[3] = sc.next().charAt(0);
        System.out.print("Enter Degree, Minute and Second : ");
        for(int i=0; i<3;i++)
            location2[1][i] = sc.nextInt();
    }

    public static void convert(char [] direction) {
        for (int i = 0; i < 2; i++) {
            if (direction[i] == 'N' || direction[i] == 'E')
                degree1[i] = location1[i][0] + (double) (location1[i][1] * 60 + location1[i][2]) / 3600;
            else if (direction[i] == 'S' || direction[i] == 'W') {
                degree1[i] = location1[i][0] + (double) (location1[i][1] * 60 + location1[i][2]) / 3600;
                degree1[i] *= -1;
            }
        }
        System.out.println(degree1[0] + "  " + degree1[1]);
        for (int i = 2; i < 4; i++){
            if (direction[i] == 'N' || direction[i] == 'E')
                degree2[i - 2] = location2[i - 2][0] + (double) (location2[i - 2][1] * 60 + location2[i - 2][2]) / 3600;
            else if (direction[i] == 'S' || direction[i] == 'W') {
                degree2[i - 2] = location2[i - 2][0] + (double) (location2[i - 2][1] * 60 + location2[i - 2][2]) / 3600;
                degree2[i - 2] *= -1;
            }
        }
        System.out.println(degree2[0] + "  " + degree2[1]);
    }

    public static double calc(){
        double la1 = Math.toRadians(degree1[0]);
        double long1 = Math.toRadians(degree1[1]);
        double la2 = Math.toRadians(degree2[0]);
        double long2 = Math.toRadians(degree2[1]);

        double a = Math.sin((la1-la2)/2) * Math.sin((la1-la2)/2) + Math.cos(la1)
                * Math.cos(la2) * Math.sin((long1-long2)/2) * Math.sin((long1-long2)/2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt((1-a)));

        return 6371 * c;
    }

}
