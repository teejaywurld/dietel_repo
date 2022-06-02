package RedoneJavaExercises.ChapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryCalculatorTest {
    SalaryCalculator employeesGrossPay;

    @BeforeEach
    void setUp(){
        employeesGrossPay = new SalaryCalculator();
    }

    @Test
    void testThatWorkingHoursCanBeInputted(){
        employeesGrossPay.setWorkingHours(40.0);
        double hoursWorked = employeesGrossPay.getWorkingHours();
        assertEquals(40.0, hoursWorked);
    }

    @Test
    void testThatHourRateCanBeInputted(){
        employeesGrossPay.setHourlyRate(10);
        double hourRate = employeesGrossPay.getHourlyRate();
        assertEquals(10, hourRate);
    }

    @Test
    void testThatWorkingHoursCanBeCounted(){
        employeesGrossPay.setCounter(1);
        int count = employeesGrossPay.getCounter();
        assertEquals(1, count);
    }

    @Test
    void testThatEmployeesPayCanBeCalculated(){
        employeesGrossPay.setWorkingHours(80.0);
        employeesGrossPay.setHourlyRate(10);
        double payment = employeesGrossPay.getEmployeesPay();
        assertEquals(1000.0, payment);
    }
}

