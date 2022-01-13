package chapterThree;

public class AccountClass {
        private String accountName;
        private double balance;

        public AccountClass (String accountName, double balance){
            this.accountName = accountName;
            this.balance = balance;
        }
        public String getAccountName(){
            return accountName;
        }
        private void setAccountName(String newName) {
            accountName = newName;
        }
        public double getAccountBalance(){
            return balance;
        }

        public void deposit(double depositAmount){
            if (depositAmount <= 0){
                depositAmount = 0;
            }
            balance += depositAmount;
        }

        public void withdrawal(double withdrawalAmount){
            if (withdrawalAmount >= balance){
                System.out.println("Withdrawal amount exceeded account balance");
            }
            withdrawalAmount = 0;
            this.balance = balance;
            balance -= withdrawalAmount;
        }
    }
