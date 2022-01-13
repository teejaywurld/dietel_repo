package chapterThree;

import java.time.Month;

public class DateTest {
        public static void main(String[] args) {
            Date today = new Date (07, 24, 1969);
            System.out.println( today.getMonth() + "/" + today.getDay() + "/" + today.getYear());
        }
    }
