package RedoneJavaExercises.ChapterFour;

import javax.swing.*;

public class SalaryCalculator {

    private double workingHours;
    private double hourlyRate;
    private int count = 1;
    private double pay;

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setCounter(int count) {
        this.count = count;
    }

    public int getCounter() {
        return count++;
    }

    public void setEmployeesPay(double pay) {
        this.pay = pay;
    }

    public double getEmployeesPay( ) {
        if (workingHours > 40) {
            double extraHours = workingHours - 40;
            double extraPay = (1.5 * hourlyRate) * extraHours;
            double grossPay = (40.0 * hourlyRate);
            return extraPay + grossPay;
        }
        else {
            pay = workingHours * hourlyRate;
            return pay;
        }
    }

}

