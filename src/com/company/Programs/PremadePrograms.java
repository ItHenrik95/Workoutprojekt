package com.company.Programs;

import java.util.Scanner;

public class PremadePrograms extends Program  {

    private Scanner input = new Scanner(System.in);
    public void workoutProgram1()  {
        System.out.println("Welcome to workout program n1!" );
        System.out.println("Here are the following exercises for this program, the weights in the program is only a recommendation");
        System.out.println("Feel free to adjust the weights after your own preference");
        System.out.println("Squats: 3 sets of 8-10 reps");
        System.out.println("Bench press: 3 sets of 8-10 reps");
        System.out.println("Barbell Rows: 3 sets of 8-10 reps");
        System.out.println("When you are done with a set press enter to start the rest timer.");
        System.out.println("Press enter when you wanna start the program");
        input.nextLine();
        for (int i = 0; i < 3; i++){ // dela upp for-lopparna i metoder som du kallar på. blir lättare att läsa.
            System.out.println("Aight lets go! Squats 8-10 reps 70% of you PB ");
            System.out.println("Press enter to start the rest (60 sec rest)");
             input.nextLine();
             timmer60sec();
        }
        for (int i = 0; i < 3; i++){
            System.out.println("Good job! next exercise is bench press 8-10 reps 70% of you PB ");
            System.out.println("Press enter to start the rest(50 sec rest)");
            input.nextLine();
            timmer40sec();
        }
        for (int i = 0; i < 3; i++){
            System.out.println("Almost done! Barbell Rows 8-10 reps 70% of you PB ");
            System.out.println("Press enter to start the rest (40 sec rest)");
            input.nextLine();
            timmer40sec();
        }
        System.out.println("Good job! You have completed the program!");
        System.out.println("Press enter to go back to the main menu");
        input.nextLine();
        System.out.println("");
    }
    public void workoutProgram2(){
        System.out.println("Welcome to workout program n2!" );
        System.out.println("Here are the following exercises for this program, the weight in the programs are only a recommendation");
        System.out.println("Feel free to adjust the weights after your own preference");
        System.out.println("Deadlift: 3 sets of 8-10 reps");
        System.out.println("LatPulls: 3 sets of 8-10 reps");
        System.out.println("Military press: 3 sets of 8-10 reps");
        System.out.println("When you are done with a set press enter to start the rest timer.");
        System.out.println("Press enter when you wanna start the program");
        input.nextLine();
        for (int i = 0; i < 3; i++){
            System.out.println("Aight lets go! Deadlift 8-10 reps 70% of you PB ");
            System.out.println("Press enter to start the rest(rest 60 sec)");
            input.nextLine();
            timmer60sec();
        }
        for (int i = 0; i < 3; i++){
            System.out.println("Good job! next exercise is LatPulls 8-10 reps 80% of you PB ");
            System.out.println("Press enter to start the rest(rest 40 sec)");
            input.nextLine();
            timmer40sec();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Almost done! Military press 8-10 reps 60% of you PB ");
            System.out.println("Press enter to start the rest (rest 40 sec)");
            input.nextLine();
            timmer40sec();
        }
        System.out.println(" Good job! You are done with the program");
        System.out.println("Press enter to return to the main menu");
        input.nextLine();
        System.out.println("");
    }

}
