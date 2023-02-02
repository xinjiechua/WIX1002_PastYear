package Y2020.Q5;

public class Cloud {
    String pkg;
    double cost;

    public double getCost(){
        return cost;
    }

    public Cloud(String pkg){
        this.pkg = pkg;
    }

    public String toString(){
        return "Cloud Package : " + pkg + "  Total Cost= " + cost;
    }
}
