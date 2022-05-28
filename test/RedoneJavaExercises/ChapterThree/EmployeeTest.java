package RedoneJavaExercises.ChapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee myEmployee;
    Employee employeeStaff;

    @BeforeEach
    void setUp() {
        myEmployee = new Employee("Olubunmi", "Akinwonuola", 50_000.00);
    }

    @Test
    void testThatEmployeeHasAFirstName(){
        myEmployee.setFirstName("Olubunmi");
        String firstName = myEmployee.getFirstName();
        assertEquals("Olubunmi", firstName);
    }

    @Test
    void testThatEmployeeHasAMonthlySalary(){
        myEmployee.setMonthlySalary(50_000.00);
        double monthlySalary = myEmployee.getMonthlySalary();
        assertEquals(50_000.00, monthlySalary);
    }

    @Test
    void testThatEmployeeHasALastName(){
        myEmployee.setLastName("Akinwonuola");
        String lastName = myEmployee.getLastName();
        assertEquals("Akinwonuola", lastName);
    }

    @Test
    void testThatPercentageCanBeAdded(){
        assertEquals(myEmployee.addRaise(), myEmployee.getMonthlySalary());
        System.out.println(myEmployee.getMonthlySalary());
    }

    @Test
    void testThatEmployeesSalaryCanBeDisplayed(){
        assertEquals(600_000,myEmployee.showYearlySalary());
        System.out.println(myEmployee.showYearlySalary());
    }
}
