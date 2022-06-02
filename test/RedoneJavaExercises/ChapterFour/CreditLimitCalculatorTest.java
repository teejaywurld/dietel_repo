package RedoneJavaExercises.ChapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditLimitCalculatorTest {
    CreditLimitCalculator creditLimit;

    @BeforeEach
    void setUp(){
        creditLimit = new CreditLimitCalculator();
    }

    @Test
    void testThatCustomerHasAnAccountNumber(){
        creditLimit.setAccountNumber(30778154);
        int accountNumber = creditLimit.getAccountNumber();
        assertEquals(30778154, accountNumber);
    }

    @Test
    void testThatACustomerHasABalance(){
        creditLimit.setOldBalance(5000);
        int customerBalance = creditLimit.getOldBalance();
        assertEquals(5000, customerBalance);
    }

    @Test
    void testThatCustomerHasCharges(){
        creditLimit.setCharges(15);
        int customerCharges = creditLimit.getCharges();
        assertEquals(15, customerCharges);
    }

    @Test
    void testThatCustomerHasACreditedAmount(){
        creditLimit.setCredits(2500);
        int creditedAmount = creditLimit.getCredits();
        assertEquals(2500, creditedAmount);
    }

    @Test
    void testThatCustomerHasACreditLimit(){
        creditLimit.setCreditLimit(2000);
        int customersLimit = creditLimit.getCreditLimit();
        assertEquals(2000, customersLimit);
    }

    @Test
    void testThatCustomerHasANewBalance(){
        creditLimit.setOldBalance(2000);
        creditLimit.setCharges(15);
        creditLimit.setCredits(3000);
        int newBalance = creditLimit.getNewBalance();
        assertEquals(-985, newBalance);
        System.out.println("Credit limit exceeded");
    }
}


