
package Y2018_2;

public class LinearEquation {
    private int a,b,c,d,e,f;
    public LinearEquation(int a, int b,int c, int d, int e, int f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    public boolean isSolvable(){
        return(a*d - b*c != 0);
    }
            
    @Override
    public String toString(){
        return "The equation :\n" + a + "x + " + b + "y = " + e + "\n" + c + "x + " + d + "y = " + f;
    }
    
    public  int computeX(){
        return (e*d - b*f)/(a*d-b*c); 
    }
    
    public int computeY(){
        return (a*f - e*c)/(a*d-b*c); 
    }
}
