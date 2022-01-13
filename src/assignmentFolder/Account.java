package assignmentFolder;

public class Account {
        private String accountName;
        private int balance;
        // private static int balance;

        public Account(String accountName){
            this.accountName = accountName;
        }

        public String getAccountName(){
            return accountName;
        }
        private void setAccountName(String newName){
            accountName = newName;
        }
        public void deposit(int amount){
            balance = balance + amount;
        }
        public void withdraw (int amount){
            balance = balance - amount;
        }
        public int checkBalance(){
            return balance;
        }

    }
