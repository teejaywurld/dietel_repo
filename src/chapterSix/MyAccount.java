package chapterSix;

public class MyAccount {
    private String name;
    private String pin;
    private int balance = 50_000;

    public MyAccount(String name, String accountPin) {
        this.name = name;
        pin = accountPin;
    }

    public int getBalance(String pin) {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int deposit(int depositAmount) {
        balance = balance + depositAmount;
        return balance;
    }
}
