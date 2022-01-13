package code_exercises;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class BMI_Calculator {

        public double calculateBMI(double weightInPounds, double heightInInches) {
            if (weightInPounds < 0.0 && heightInInches < 0.0){
                System.out.println("Height or weight is invalid!");
                return -1.0;
            }
            double bmi = (weightInPounds * 703)/(heightInInches * heightInInches);
            bmi = Math.ceil(bmi * 1000)/1000;


            switch((int)bmi * 1000){

            }

            return bmi;
        }
    }
