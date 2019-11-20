package com.company;
import com.company.Calories.CaloriCalculater;
import com.company.Programs.PercentageCalculation;
import com.company.Programs.PremadePrograms;
import com.company.Programs.ReadPrograms;
import com.company.Programs.SelfMadePrograms;

import java.util.Scanner;
public class Menu {

    public static void run()  {
        System.out.println("");
        System.out.println(" Welcome to Henkes helpful workout app");
        Scanner input = new Scanner(System.in);
        int choice;
        do{
            System.out.println("What would you like to do? choose from the list below using 0-9.");
            System.out.println(" 1 Check out a pre-made program ");
            System.out.println(" 2 Make your own workout program ");
            System.out.println(" 3 Read 1 of your own workout program");
            System.out.println(" 4 Would you like to calculate how much weight based on your PB a lift is? for example what 80% of you PB is");
            System.out.println(" 5 Would you like to calculate your PB based on your 5 rep max?");
            System.out.println(" 6 Would you like to calculate how much calorise is in the product you are eating?");
            System.out.println(" 0 exit program ");
                choice = input.nextInt();
            switch (choice){
                case 1:
                    menuChoice();
                    continue;
                case 2:
                    SelfMadePrograms program = new SelfMadePrograms();
                    program.selfMadePrograms();
                    continue;
                case 3:
                    ReadPrograms readPrograms = new ReadPrograms();
                    readPrograms.readFile();
                    continue;
                case 4:
                    PercentageCalculation outcome = new PercentageCalculation();
                    System.out.println(outcome.percentCalc() + " kg");
                    continue;
                case 5:
                    PercentageCalculation p = new PercentageCalculation();
                    System.out.println(p.oneRepMax() + " Kg");
                    continue;
                case 6:
                    menuChoice2();
                    continue;
                case 0:
                    System.out.println("Program shutting down");
                    break;
                default:
                    System.out.println(" Error. In order to move forward please use the numbers 1-6");
                    System.out.println("");
            }
        }while(choice != 0);
    }
    public static void menuChoice(){
        Scanner input = new Scanner(System.in);
        System.out.println("You can choose between 2 full body programs");
        System.out.println("Press 1 to get the first program Squart/Bench press/Barbell Rows");
        System.out.println("Press 2 to get the second program Deadlift/LatPulls/Military press");
        System.out.println("Press 0 to exit this menu");
        int pick = input.nextInt();
        switch (pick){
            case 1:
                PremadePrograms program1 = new PremadePrograms();
                program1.workoutProgram1();
            case 2:
                PremadePrograms program2 = new PremadePrograms();
                program2.workoutProgram2();
            case 0:
                break;
            default:
                System.out.println("Error. That is not a valid number.");
        }
    }
    public static void menuChoice2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Here you can choose between calculating the whole product carbohydrates/protein and fat together");
        System.out.println("Or you can pick a specific typ. ");
        System.out.println("Press 1 if you want to calculate them all at once(carbohydrates/protein and fat)\n or ");
        System.out.println("press 2 if you want to pick a specific typ ");
        int in = input.nextInt();
        CaloriCalculater value = new CaloriCalculater();
        if (in == 1){
            System.out.println(value.mix() + " calories together");
        }
        else if (in == 2){
            System.out.println("What specific typ would you like to calculate?");
            System.out.println("Press 1 for carbohydrates");
            System.out.println("Press 2 for protein");
            System.out.println("Press 3 for fat");
            int pick = input.nextInt();
            switch (pick){
                case 1:
                    System.out.println(value.carbohydrates() + " calories");
                    break;
                case 2:
                    System.out.println(value.protein() + " calories");
                    break;
                case 3:
                    System.out.println( value.fat() + " calories");
                default:
                    break;

            }
        }
    }
}
