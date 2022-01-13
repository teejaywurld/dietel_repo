package assignmentFolder;

public class AccountMini {
        private String name;
        private double balance;
        private int day;
        int month;
        int year;

        public AccountMini(String name, double balance, int day, int month, int year){
            this.name = name;
            this.balance = balance;
            this.day = day;
            this.month = month;
            this.year = year;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
        public void deposit(double depositAmount){
            if(depositAmount <= 0){
                depositAmount = 0;
            }
            balance = depositAmount + balance;
            this.balance = balance;
        }
        public double getBalance(){
            return balance;
        }
        public void setDay(int day){
            this.day = day;
        }
        public int getDay(){
            return day;
        }
        public void setMonth(int month){
            this.month = month;
        }
        public int getMonth(){
            return month;
        }
        public void setYear(int year){
            this.year = year;
        }
        public int getYear(){
            return year;
        }
        public void displayDateOfBirth(){
            System.out.printf("%d/%d/%d", getDay(),getMonth(),getYear());
        }
        public void withdrawal(double withdrawalAmount){
            if(withdrawalAmount > balance){
                System.out.println("Account balance Exceeded");
                withdrawalAmount = 0;
                this.balance = balance;
            }
            balance = balance - withdrawalAmount;
        }
    }
