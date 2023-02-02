package Y2020.Q5;

public class Job {
    String name;
    int num, memory;

    public String getName(){
        return name;
    }

    public int getNum(){
        return num;
    }

    public int getMemory(){
        return memory;
    }

    public Job(String name, int num, int memory){
        this.name = name;
        this.num = num;
        this.memory = memory;
    }

    public String toString(){
        return "Job Name : " + name + " Memory = " + memory + "GB Number Of Task = " + num;
    }
}
