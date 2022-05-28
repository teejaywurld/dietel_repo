package RedoneJavaExercises.ChapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceClassTest {
    InvoiceClass storeInvoice;

    @BeforeEach
    void setUp() {
        storeInvoice = new InvoiceClass("0026", "Online Store", 35, 5500.50);
    }

    @Test
    void testThatStoreHasAPartNumber(){
        storeInvoice.setPartNumber("0026");
        String partNumber = storeInvoice.getPartNumber();
        assertEquals("0026", partNumber);
    }

    @Test
    void testThatStoreHasADescription(){
        storeInvoice.setStoreDescription("Online Store");
        String storeDescription = storeInvoice.getStoreDescription();
        assertEquals("Online Store", storeDescription);
    }

    @Test
    void testThatStoreHasAQuantityItem(){
        storeInvoice.setQuantityDescription(35);
        int quantityDescription = storeInvoice.getQuantityDescription();
        assertEquals(35, quantityDescription);
    }

    @Test
    void testThatStoreHasPricePerItem(){
        storeInvoice.setItemPrice(5500.50);
        double itemPrice = storeInvoice.getItemPrice();
        assertEquals(5500.50, itemPrice);
    }

    @Test
    void testThatInvoiceAmountCanBeSet(){
        storeInvoice.setQuantityDescription(20);
        storeInvoice.setItemPrice(2000.53);
        double invoiceAmount = storeInvoice.getInvoiceAmount();
        assertEquals(40_010.6, invoiceAmount);
    }
}
