//Brandon Hasty
//3-20-25
//M1 Assignment
//This codes purpose is to find the energy needed to heat the water.

import java.util.Scanner; //Scanner is the utility package

public class WaterHeatingEnergy {

    public static void main(String[] args) {
        //Create scanner input
        Scanner input = new Scanner(System.in);

        //Prompt user to input waterMass
        System.out.print("Enter the amount of water in Kilograms: ");
        double waterMass = input.nextDouble();

        //Prompt user to input the intial temperature of water
        System.out.print("Enter the initial temperature of the water in °C: ");
        double initialTemperature = input.nextDouble();

        //Prompt user to input the final temperature of water
        System.out.print("Enter the final temperature of the water in °C: ");
        double finalTemperature = input.nextDouble();

        // compute for the energy needed
        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        //Display the outcome
        System.out.println("The energy needed to heat the water is " + energy + " Joules ");
    }
}

// sources used to help build my code
//Liang, Y. D. (2022). Introduction to java programming and Data Structures: Comprehensive Version. Pearson Education Limited.