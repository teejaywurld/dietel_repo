package chapterThree;

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public void setMonth(int newMonth){
        month = newMonth;
    }
    public int getMonth(){
        return month;
    }
    public void setDay(int newDay){
        day = newDay;
    }
    public int getDay(){
        return day;
    }
    public void setYear(int newYear){
        year = newYear;
    }
    public int getYear(){
        return year;
    }
    public int getDisplayDate(){
        return month / day / year;
    }
}
