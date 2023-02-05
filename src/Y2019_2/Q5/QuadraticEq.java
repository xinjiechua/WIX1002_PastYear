
package Y2019_2.Q5;

public class QuadraticEq {
    private int a,b,c;
    
    public QuadraticEq(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int getA(){
        return a;
    }
    
    public int getB(){
        return b;
    }
    
    public int getC(){
        return c;
    }
    
    public int Discriminant(){
        return (b*b - 4*a*c);
    } 
    
    public int calcRoot1(){
        if(Discriminant()>=0)
            return (-b + (int)Math.sqrt(Discriminant())/(2*a));
        else
            return 0;
    }
    
    public int calcRoot2(){
        if(Discriminant()>=0)
            return (-b - (int)Math.sqrt(Discriminant())/(2*a));
        else
            return 0;
    }
}
