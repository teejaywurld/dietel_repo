package chapterThree;

public class EmployeeTest {
    public static void main(String[] args) {
        // double yearlySalary;

        Employee ojoAccount = new Employee("Adebimpe", "Ojo", 85_000);
        Employee sarahAccount = new Employee("Sarah", "Olagunju", 98_500);
        System.out.println(ojoAccount.getFirstName() + ojoAccount.getLastName() + "'s monthly salary is " + ojoAccount.getMonthlySalary());
        System.out.println(sarahAccount.getFirstName() + sarahAccount.getLastName() + "'s monthly salary is " + sarahAccount.getMonthlySalary());

        ojoAccount.setMonthlySalary(ojoAccount.getMonthlySalary() * 1.1);
        sarahAccount.setMonthlySalary(sarahAccount.getMonthlySalary() * 1.1);

        System.out.println("Employees' Salary after 10% raise");
        System.out.println(ojoAccount.getFirstName() +  ojoAccount.getLastName() + "'s monthly salary " + ojoAccount.getMonthlySalary());
        System.out.println(sarahAccount.getFirstName() +  sarahAccount.getLastName() + "'s monthly salary " + sarahAccount.getMonthlySalary());
    }
}
