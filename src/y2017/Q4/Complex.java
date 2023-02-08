
package y2017.Q4;

public class Complex {
    protected double r, i;
    
    public Complex(){
        r=0;
        i=0;
    }
    
    public Complex(double r, double i){
        this.r = r;
        this.i = i;
    }
    
    public Complex addComplexNum(Complex com2){
        double real = this.r + com2.r;
        double imag = this.i + com2.i;
        Complex result = new Complex(real,imag);
        return result;
    }
    
     public Complex subtractComplexNum(Complex com2){
        double real = this.r - com2.r;
        double imag = this.i - com2.i;
        Complex result = new Complex(real,imag);
        return result;
    }
     
     @Override
     public String toString(){
         return"(" + (int)r + " + " + (int)i + "i" + ")" ;
     }
}
