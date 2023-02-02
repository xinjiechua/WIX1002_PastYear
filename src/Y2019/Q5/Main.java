package Y2019.Q5;

public class Main {
    public static void main(String[] args) {
        Delivery a = new Delivery("Ali","Ahmad",4.4);
        Delivery b = new Delivery("Ah Chong","Fatimah",63.1);
        SpecialDelivery c = new SpecialDelivery("FSKTM, UM","FK, UM",32.5,true,false);
        SpecialDelivery d = new SpecialDelivery("Ang","Liew",19,true,true);

        System.out.println(a + "\n");
        System.out.println(b + "\n");
        System.out.println(c + "\n");
        System.out.println(d + "\n");

        double total = a.totalCost() + b.totalCost()+ c.totalCost()+ d.totalCost();
        System.out.println("The total shipping cost is RM " + total);

    }
}
