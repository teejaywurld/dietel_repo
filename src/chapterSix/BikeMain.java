package chapterSix;

import java.util.Scanner;

public class BikeMain {
        public static void main(String[] args) {
            Scanner classic = new Scanner(System.in);
            Bike superBike = new Bike("Suzuki, ");
            //     System.out.println(superBike.getName() + "your new superBike");

            int lightspeed;

            superBike.printBikeDetails();

            while(true){
                if(superBike.isOn()){
                    System.out.println("1. Set Gear\n" +
                            "2. Change Gear to 1\n " +
                            "3. Change Gear to 2\n " +
                            "4. Change Gear to 3\n " +
                            "5. Change Gear to 4\n " +
                            "6. Accelerate\n " +
                            "7. Decelerate \n " +
                            "8. Turn Bike Off \n " +
                            "9. End Program\n ");

                    lightspeed = classic.nextInt();
                    if (lightspeed == 1){
                        System.out.println("Hi,press 1 to set your gear (1 to 4): ");
                        superBike.setSpeed(classic.nextInt());
                    }
                    else if (lightspeed == 2){
                        superBike.setGear();
                    }
                    else if (lightspeed == 3){
                        superBike.setGear();
                    }
                    else if( lightspeed == 4){
                        superBike.setGear();
                    }
                }
            }
        }
    }
