
package Y2017_2;

public class DayOfTheWeek {
    private int h,q,m,y,J,K;
    
    public DayOfTheWeek(int q, int m, int y){
        this.q = q;
        this.m = m;
        this.y = y;
    }
    public boolean isValid(){
        int max;
        switch(m){
            case 4:
            case 6:
            case 9:
            case 11:
                max = 30;
                break;
            case 14:
                if(isleap()){
                    max = 29;
                    break;
                } else {
                    max = 28;
                    break;
                } 
            case 13:
                max = 31;
                break;
            default:
                max = 31;
        }
        return (q>=1 && q<=max);
    }
    
    public int getDay(){
       if(m == 13 || m==14){
        J = (y-1)/100;
        K = (y-1)%100;
       } else {
        J = y/100;
        K = y%100; 
       }
       return (int)(q + Math.floor(13*(m+1)/5) + K + Math.floor(K/4) + Math.floor(J/4) + 5*J)%7;
    }
    public boolean isleap(){
         return (y%4 == 0 && y%100!=0) || y%400==0;
    }
    
    @Override
    public String toString(){
        if(isValid()){
            String[]day = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
            return q + "/" +  m + "/" +  y + " is on " + day[getDay()];
        } else
            return q + "/" +  m + "/" +  y + " is invalid Input";
    }
}
