package chapterFour;

import java.util.Scanner;

// Program calculates average mpg
// import java.util.Scanner;

public class Mileage {
        // perform miles-per-gallon calculations
        public void calculateMPG() {
            Scanner input = new Scanner( System.in );

            int miles; // miles for one tankful
            int gallons; // gallons for one tankful
            int totalMiles = 0; // total miles for trip
            int totalGallons = 0; // total gallons for trip

            double milesPerGallon; // miles per gallon for tankful
            double totalMilesPerGallon; // miles per gallon for trip

            // prompt user for miles and obtain the input from user
            System.out.print( "Enter miles (-1 to quit): " );

            miles = input.nextInt();

            // exit if the input is -1; otherwise, proceed with the program
            while ( miles != -1 ) {
                // prompt user for gallons and obtain the input from user
                System.out.print( "Enter gallons:" );
                gallons = input.nextInt();

                // add gallons and miles for this tank to total
                totalMiles += miles;
                totalGallons += gallons;

                // calculate miles per gallon for the current tank
                if ( gallons != 0 )
                {
                    milesPerGallon = (double) miles / gallons;
                    System.out.printf( "MPG this tankful: %.2f\n",
                            milesPerGallon );
                } // end if statement

                // calculate miles per gallon for the total trip
                if ( totalGallons != 0 )
                {
                    totalMilesPerGallon = (double) totalMiles / totalGallons;
                    System.out.printf( "Total MPG: %.2f\n",
                            totalMilesPerGallon );
                } // end if statement

                // prompt user for new value for miles
                System.out.print( "Enter miles (-1 to quit): " );
                miles = input.nextInt();
            } // end while loop
        } // end method calculateMPG
    } // end class Gas

