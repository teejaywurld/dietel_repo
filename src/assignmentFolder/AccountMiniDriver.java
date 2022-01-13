package assignmentFolder;

public class AccountMiniDriver {
        public static void main(String[] args) {
            AccountMini myAccount = new AccountMini("Dayo Adekoya's ", 8000, 20, 9, 2021);
            System.out.printf("The accountName is %s%n ", myAccount.getName());
            System.out.printf("%s balance: %.2f%n", myAccount.getName(), myAccount.getBalance());
            myAccount.deposit(60000);
            System.out.printf("Adding %.2f%n to the balance ", myAccount.getBalance());
            System.out.printf("%s balance: %.2f%n ", myAccount.getName(), myAccount.getBalance());
            myAccount.withdrawal(35000);
            System.out.printf("%s balance: %.2f%n", myAccount.getName(), myAccount.getBalance());
            System.out.print(myAccount.getName() + " date of birth: ");
            myAccount.displayDateOfBirth();

        }
    }
