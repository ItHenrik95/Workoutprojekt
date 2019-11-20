package com.company.Programs;


import java.util.Scanner;

public class PercentageCalculation {
      private Scanner percentageInput = new Scanner(System.in);
      private Scanner weightInput = new Scanner(System.in);
      private Scanner input = new Scanner(System.in);
      private double value;
    public  Double percentCalc(){ // gör ett objeckt av denna metoden så man kan använda det när man gör sitt egna projekt.
        System.out.println(" What is your PB?(Personal Best)");
        double weight = weightInput.nextDouble();
        System.out.println(" How muck % of your PB would you like to calculate");
        double percentage = percentageInput.nextDouble();
        value = weight/100 * percentage;
        return value;
    }
    public double oneRepMax(){
        System.out.println("Do you wanna calculate your 1RM(1 rep max) for the upper body or for the lower body?");
        String choice = input.nextLine();
        if (choice.equals("upper body")){
            System.out.println("What is the heaviest weight you can do 5 reps on?");
            double weight = weightInput.nextDouble();
            value = weight * 1.1307 + 0.6998;
            double outcome = Math.round(value * 10) / 10.0;
            return outcome;
        }
        else if (choice.equals("lower body")){
            System.out.println("What is the heaviest weight you can do 5 reps on?");
            double weight = weightInput.nextDouble();
            value = weight * 1.09703 + 14.2546;
            double outcome = Math.round(value * 10 ) / 10.0;
            return outcome;
        }
        return 0;
    }


}
