package RedoneJavaExercises.ChapterFour;

public class SalesCommissionCalculator {

    private double sales;
    private double gross;
    private double numbersSold;
    private double weeklyBonus;

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getSales() {
        return sales;
    }

    public void setGross(double gross) {
        this.gross = gross;
    }

    public double getGross() {
        return gross;
    }

    public void setNumbersSold (double numbersSold) {
        this.numbersSold = numbersSold;
    }

    public double getNumbersSold() {
        return numbersSold;
    }

    public void setWeeklyBonus (double weeklyBonus) {
        this.weeklyBonus = weeklyBonus;
    }

    public double getWeeklyBonus() {
        return weeklyBonus;
    }

    public double getSalesPersonsEarning() {
        return 200 + sales * 0.09;
    }
}

