package Y2020;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int n=0;
        int jobNum = 0;
        String [][] records = new String[100][22];

        try{
            Scanner sc = new Scanner(new FileInputStream("sampleLog"));
            while(sc.hasNextLine()){
                n++;
                sc.nextLine();
            }
            records = new String[n][22];
            sc = new Scanner(new FileInputStream("sampleLog"));
            int i=0;
            while(sc.hasNextLine()){
                records[i] = sc.nextLine().split(" ");
                if(records[i][1].contains("user=") && records[i][1].contains(";S;"))
                    jobNum++;
                i++;
            }
        } catch(FileNotFoundException e){
            System.out.println("File was not found.");
        }
        System.out.println("Reading from log file...");
        System.out.println("******************************************");
        System.out.println("Records read from log file");

        for(int i=0; i<n; i++){
            System.out.printf("Record %d: \n", i+1);
            for(String str : records[i]){
                if(!str.isEmpty())
                    System.out.printf("\t%s\n",str);
            }
            System.out.println(" ");
        }

        System.out.println("total records read: " + n + "\n");
        System.out.println("*******************************************");
        System.out.println("Print user submission stat");
        System.out.println("User\t\t\tJobs Submitted");
        System.out.println("----\t\t\t--------------");

        String[]users = new String[jobNum];
        int [] userJobs = new int [jobNum];
        int idx = 0;
        for(int i=0; i<n;i++){
            if(records[i][1].contains("user=") && records[i][1].contains(";S;")){
                String user = records[i][1].substring(records[i][1].indexOf("user")+5);
                boolean found = false;
                for(int j=0; j<idx;j++){
                    if(users[j].equals(user)){
                        userJobs[j]++;
                        found = true;
                    }
                }
                if(!found){
                    users[idx] = user;
                    userJobs[idx++]++;
                }
            }
        }
        int userNum = 0;
        for (int userJob : userJobs) {
            if (userJob != 0)
                userNum++;
        }

        for(int i=0; i<userNum; i++){
            System.out.println(users[i]+"\t\t\t"+userJobs[i]);
        }
        System.out.println();
        System.out.println("*************************************************");
        System.out.println("Print jobs status");
        System.out.println();

        System.out.println("Job ID\tSubmitted (queue)\tStarted (start time)\tExpired (end time/error)");
        System.out.println("------\t-----------------\t--------------------\t------------------------");

        for(int i=0; i<n; i++){
            if (records[i][1].contains(";Q;")){ // Queue
                String jobID = records[i][1].substring(records[i][1].indexOf(";Q;")+3, records[i][1].indexOf(".ce2.dicc"));
                String queue = records[i][1].substring(records[i][1].indexOf("queue=")+6);
                String startTime;
                for(int j=i+1; j<n;j++){
                    if (records[j][1].contains(";S;") && records[j][1].contains(jobID)){
                        startTime = records[j][8].substring(6);
                        boolean ended = false;
                        String exitStatus = "";
                        for(int k = j+1; k<n; k++){
                            if (records[k][1].contains(";E;") && records[k][1].contains(jobID)){
                                ended = true;
                                exitStatus = records[k][records[k].length-5].substring(12);
                                if (exitStatus.equals("1")){ // ended successfully
                                    exitStatus = records[k][records[k].length-6].substring(4);
                                }else{ // Error
                                    exitStatus = "Error: Exit Status " + exitStatus;
                                }
                            }
                        }
                        if (!ended){
                            exitStatus = "null";
                        }
                        System.out.printf("%s\t%-5s (%s)\t%10s (%s)\t\t\t%s\n", jobID, "Y",queue,"Y", startTime, exitStatus);
                    }
                }
            }
        }

    }
}
