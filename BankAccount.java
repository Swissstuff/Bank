public abstract class BankAccount {
        private long number;
        private String owner;
        protected double balance;

        public BankAccount(long number, String owner, double balance)
        {
            this.number = number;
            this.owner = owner;
            this.balance = balance;
        }

        public long getNumber() {
            return number;
        }

        public String getOwner() {
            return owner;
        }

        public double getBalance() {
            return balance;
        }

        public void setNumber(long number) {
            this.number = number;
        }

        public void deposit(double amount) {
            this.balance += amount;
        }

        public boolean withdraw(double amount) {
            if (amount < balance) {
                this.balance -= amount;
                return true;
            }
            else 
                return false;
        }

        public String toString() {
            return String.format("%-10d\t%-20s\t%-10.2f", number, owner, balance);
        }
}