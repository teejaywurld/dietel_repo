package chapterThree;

public class AccountClassDriver {
    public static void main(String[] args) {
        AccountClass hisAccount = new AccountClass ("Abayomi Ojo", 50000);
        System.out.printf("The accountName is %s%n ", hisAccount.getAccountName());
        System.out.printf("%s balance: %.2f%n ", hisAccount.getAccountName(), hisAccount.getAccountBalance());
        hisAccount.deposit(70_000);
        System.out.printf("Adding %.2f to the balance%n ", hisAccount.getAccountBalance());
        hisAccount.withdrawal(150_000);
        System.out.printf("%s balance: %.2f%n ", hisAccount.getAccountName(), hisAccount.getAccountBalance());


    }

}
