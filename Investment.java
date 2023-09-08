public class Investment extends BankAccount {
    private String type;

    public Investment(long number, String owner, double balance, String type) {
        super(number, owner, balance);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getProfitOrLoss() {
        double temp = 1;
        if(Math.random() < 0.5)
            this.balance -= temp;
        else
            this.balance += temp;
        return temp;
    }

    public String toString() {
        return super.toString() + "\t" + this.getType();
    }
}
