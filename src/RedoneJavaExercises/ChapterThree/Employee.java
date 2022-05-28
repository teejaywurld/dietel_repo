package RedoneJavaExercises.ChapterThree;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0.0){
            this.monthlySalary = monthlySalary;
        }
        else
            this.monthlySalary = 0;

    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double addRaise() {
        monthlySalary += (monthlySalary/10);
        return monthlySalary;
    }

    public double showYearlySalary() {
        return monthlySalary * 12;
    }
}
