
package Y2016_2;

public class FinancialRecord {
    private int id;
    private double balance;
    private double annualInterestRate;
    
    
    public FinancialRecord(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }
    
    public FinancialRecord(int id, double balance){
        this.id = id;
        this.balance = balance;
    }
    
    public int getid(){
        return id;
    }
    
    public double getbalance(){
        return balance;
    }
    
    public double setannualInterestRate(){
        return annualInterestRate;
    }
    
    public void setid(int id){
        this.id = id;
    }
    
    public void setbalance(double balance){
        this.balance = balance;
    } 
    
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    } 
    
    public void getMonthlyInterestRate(){
        System.out.println("The monthly interest rate is: " + annualInterestRate/12);
    }
    
    public void withdraw(double amt){
        System.out.println("Previous balance: RM" + balance);
        balance -= amt;
        System.out.println("Current balance after withdrawal of RM " + amt + " is: RM" + balance);
    }
    
     public void deposit(double amt){
        System.out.println("Previous balance: RM" + balance);
        balance += amt;
        System.out.println("Current balance after deposit of RM " + amt + " is: RM" + balance);
    }
     
     public void displayRecordInfo(){
         System.out.println("Financial record id is: " + id + "\nFinancial record balance is: RM" + balance
         + "\nAnnual interest rate is: " + annualInterestRate);
     }
}
