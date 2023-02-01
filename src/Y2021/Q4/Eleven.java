package Y2021.Q4;

import java.io.*;

public abstract class Eleven {
    public int [] arr;
    public String file;

    public Eleven (String file) throws IOException {
        this.file = file;
        int n=0;
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream(file));
        try{
            while(true) {
                sc.readInt();
                n++;
            }
        } catch (EOFException ignored){}

        sc = new ObjectInputStream(new FileInputStream(file));
        arr = new int[n];
        int i=0;
        try{
            while(true){
                arr[i++] = sc.readInt();
            }
        } catch(EOFException ignored){}
    }

    public abstract String divide();
}

