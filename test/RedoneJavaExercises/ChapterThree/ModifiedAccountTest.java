package RedoneJavaExercises.ChapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedAccountTest {
    ModifiedAccount myAccount;

    @BeforeEach
    void setUp() {
        myAccount = new ModifiedAccount();
    }

    @Test
    void testThatAccountHasAFirstName(){
       myAccount.setFirstName("Henry");
       String firstName = myAccount.getFirstName();
       assertEquals("Henry", firstName);
    }

    @Test
    void testThatAccountHasALastName(){
        myAccount.setLastName("Adetunji");
        String lastName = myAccount.getLastName();
        assertEquals("Adetunji", lastName);
    }

    @Test
    void testThatMoneyCanBeAddedToAccount(){
        myAccount.setAccountBalance(5000);
        int accountBalance = myAccount.getAccountBalance();
        assertEquals(5000, accountBalance);
    }

    @Test
    void testThatMoneyCanBeWithdrawnFromAccount(){
        myAccount.setAccountBalance(10000);
        myAccount.withdrawalAmount(5000);
        assertEquals(5000, myAccount.getAccountBalance());
    }
}
