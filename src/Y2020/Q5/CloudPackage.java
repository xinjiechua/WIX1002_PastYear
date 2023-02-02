package Y2020.Q5;

public class CloudPackage extends Cloud {
    private int core, memory;
    private double price;

    public CloudPackage(String name){
        super(name);
    }

    public CloudPackage(String name,int core, int memory, double price){
        super(name);
        this.core = core;
        this.memory = memory;
        this.price = price;
    }

    public boolean check(Job job){
        return memory >= job.getMemory();
    }

    public double totalCost(Job job){
        cost = job.getNum()/core*price;
        return cost;
    }
}
