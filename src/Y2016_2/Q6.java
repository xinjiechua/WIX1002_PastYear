
package Y2016_2;

public class Q6 {
    public static void main(String[] args) {
        FinancialRecord a = new FinancialRecord(1234,10000);
        a.setAnnualInterestRate(7.77);
        System.out.println("The information about financial record A is as follows:");
        a.displayRecordInfo();
        
        FinancialRecord b = new FinancialRecord();
        b.setAnnualInterestRate(8.0);
        b.setid(1001);
        b.setbalance(20000);
        System.out.println("\nThe information about financial record B is as follows:");
        b.displayRecordInfo(); 
        b.getMonthlyInterestRate();
        b.deposit(1500);
        b.withdraw(500);
    }
}
