package RedoneJavaExercises.ChapterThree;

public class ModifiedAccount {

    private String firstName;
    private String lastName;
    private int accountBalance;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void withdrawalAmount(double withdrawalAmount) {
        if (withdrawalAmount > accountBalance) {
            System.out.println("Withdrawal amount exceeded account balance");
        } else
            accountBalance -= withdrawalAmount;
    }
}
