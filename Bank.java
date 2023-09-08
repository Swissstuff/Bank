public class Bank {
    private BankAccount[] accounts;
    private int count;

    public Bank() {
        BankAccount[] accounts = new BankAccount[50];
        int count = 0;
    }

    public void addAccount(BankAccount ba) {
        BankAccount accounts[count] = ba;
        count += 1;
    }

    public BankAccount findAccount(long number) {
        for(int i = 0; i < accounts.length; i++) {
            if(accounts[i].getNumber() == number) {
                return accounts[i];
            }
        }
        return null;
    }

    public void sortAccounts(boolean numberOrBalance) {
        if(numberOrBalance) {
            for(int i = 0; i <accounts.length; i++) {
                BankAccount currentVal = accounts[i];
                int j = i;
                while(j>0 && currentVal.getNumber()<(accounts[j - 1].getNumber())) {
                    accounts[j] = accounts[j - 1];
                    j--;
                }
                accounts[j] = currentVal;
            }
        }
        else {
            for(int i = 0; i <accounts.length; i++) {
                BankAccount currentVal = accounts[i];
                int j = i;
                while(j>0 && currentVal.getBalance()<(accounts[j - 1].getBalance())) {
                    accounts[j] = accounts[j - 1];
                    j--;
                }
                accounts[j] = currentVal;
            }
        }
    }

    public String toString() {
        String temp = "Type\tNumber\tOwner\tBalance\tInterest/InvestmentType\n"; 
        for(int i = 0; i < accounts.length; i++) {
            temp += accounts[i];
        }
        return temp;
    }
}