/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2018_M;

import java.util.Scanner;
import java.util.Random;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of staff [N] :");
        int n = sc.nextInt();
        int id ,cnt=0;
        Random r = new Random();
        for (int i=0; i<n;i++){
            id = r.nextInt(90000)+10000;
            System.out.println("Staff ID : " + id);
            int second = (id/1000)%10;
            int fourth = (id/10)%10;
            if(second%2==1 && fourth%2==0){
                System.out.println("Weekend Duty");
                cnt++;
            }    
            else
                System.out.println("Weekend Off");
        }   
        System.out.println("The number of staffs work during weekend is " + cnt);
    }
}
