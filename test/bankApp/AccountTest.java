package bankApp;

import chapterSix.MyAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
        public void accountCanBeCreatedTest(){
            MyAccount mijuAccount = new MyAccount("Ademiju Adam", "4736");
            String name = mijuAccount.getName();
            assertEquals("Ademiju Adam", name);
    }
    @Test
    public void balanceCanBeCreatedTest(){
        MyAccount mijuAccount = new MyAccount("Ademiju Adam", "4736");
        int balance = mijuAccount.getBalance("4736");
        assertEquals(50_000, balance);

    }
    @Test
    public void checkdepositCanBeCreated(){
        MyAccount mijuAccount = new MyAccount("Ademiju Adam", "4736");
       int deposit = mijuAccount.deposit (10_000);
        assertEquals(60_000, deposit);
    }
}
