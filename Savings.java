public class Savings extends BankAccount {
    private double YearlyInterestRate;

    public Savings (long number, String owner, double balance, double yInterestRate) {
        super(number, owner, balance);
        YearlyInterestRate = yInterestRate;
    }

    public double getYearlyInterest() {
        return YearlyInterestRate;
    } 

    public double getMonthlyInterest() {
        double temp = (((YearlyInterestRate / 12) / 100) * balance);
        balance += temp;
        return temp;
    }

    public void setYearlyInterestRate(double y) {
        YearlyInterestRate = y;
    }

    public String toString() {
        return super.toString() + "\t" + getYearlyInterest() + "%";
    }
}