package RedoneJavaExercises.ChapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesCommissionCalculatorTest {
    SalesCommissionCalculator itemsSold;

    @BeforeEach
    void setUp(){
        itemsSold = new SalesCommissionCalculator();
    }

    @Test
    void testThatSalesPersonItemSoldCanBeInputted(){
        itemsSold.setSales(239.99);
        double salesPersonItem = itemsSold.getSales();
        assertEquals(239.99, salesPersonItem);
    }

    @Test
    void testThatSalesPersonsGrossCanBeDisplayed(){
        itemsSold.setGross(650);
        double salesPersonsItem = itemsSold.getGross();
        assertEquals(650, salesPersonsItem);
    }

    @Test
    void testThatNumberOfSalesCanBeInputted(){
        itemsSold.setNumbersSold(2);
        double salePersonsItem = itemsSold.getNumbersSold();
        assertEquals(2, salePersonsItem);
    }

    @Test
    void testThatSalesPersonsItemsSoldCanBeCalculated(){
        itemsSold.setGross(0.09);
        itemsSold.setSales(8000);
        itemsSold.setWeeklyBonus(200);
        double salesPersonsBonus = itemsSold.getWeeklyBonus();
        double salesPersonsEarning = itemsSold.getSalesPersonsEarning();
        assertEquals(920.0, salesPersonsEarning);
        assertEquals(200, salesPersonsBonus);
    }
}
