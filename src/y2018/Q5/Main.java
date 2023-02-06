
package y2018.Q5;

public class Main {
    public static void main(String[] args) {
        Apple a = new Apple("Apple","Red",8);
        Apple b = new Apple("Apple","Green",11);
        Watermelon c = new Watermelon("Watermelon", "Local",7.6);
        Watermelon d = new Watermelon("Watermelon", "Imported",4);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c.toString());
        System.out.println(d.toString());
        
        System.out.println("The cheapest item is");
        if(a.totalPrice()<b.totalPrice() && a.totalPrice()<b.totalPrice()&& 
           a.totalPrice()<c.totalPrice()&& a.totalPrice()<d.totalPrice())
            System.out.println(a);
        else if(b.totalPrice()<c.totalPrice()&& b.totalPrice()<d.totalPrice())
            System.out.println(b);
         else if(c.totalPrice()<d.totalPrice())
            System.out.println(c);
        else
            System.out.println(d);
    }
}
