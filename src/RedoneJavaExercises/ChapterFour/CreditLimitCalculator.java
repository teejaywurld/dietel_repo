package RedoneJavaExercises.ChapterFour;

public class CreditLimitCalculator {

    private int accountNumber;
    private int oldBalance;
    private int charges;
    private int credits;
    private int creditLimit;
    private int newBalance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;

    }

    public int getAccountNumber() {
        return accountNumber;

    }

    public void setOldBalance(int oldBalance) {
        this.oldBalance = oldBalance;
    }

    public int getOldBalance() {
        return oldBalance;
    }

    public void setCharges(int charges) {
        this.charges = charges;
    }

    public int getCharges() {
        return charges;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getNewBalance() {
        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded");
        }
        return newBalance = oldBalance + charges - credits;
    }
}

