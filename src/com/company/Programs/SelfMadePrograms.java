package com.company.Programs;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class SelfMadePrograms  {
  private Scanner input = new Scanner(System.in);
  private Scanner add = new Scanner(System.in);
        public  void selfMadePrograms()  {
            System.out.println("Lets make a workout program together!");
            System.out.println("First you need to choice a name for your workout program.");
            System.out.println("For example: My Workout Program or ChestDay program");
            System.out.println("If you don't wanna create a new one but change an old one just enter the name of that program");
            System.out.println("Be aware that if you write in an old program you will erase what is already written in that file");
            System.out.println("If you wanna go back just enter Exit and you will return to the main menu");
            String program = input.nextLine();
            if (!program.equals("Exit")){
                FileOutputStream fos = null;
                try {
                    fos = new FileOutputStream(program);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                PrintWriter pw = new PrintWriter(fos);
                String in;
                do{
                    System.out.println("Here you add the exercice you wanna have in your program");
                    System.out.println("If you want help just write Help in the console");
                    System.out.println("When you are done just write Done to complete your program");
                    System.out.println("What exerice would you like to add?");
                    in = add.nextLine();
                    if (in.equals("Help")){
                        help();
                    }
                    else if (!in.equals("Help")){
                        pw.println(in);
                    }
                }while(!in.equals("Done"));
                pw.close();
            }
            else if (program.equals("Exit")){
                System.out.println("Returning to the main menu!");
            }
            System.out.println("Return to the main menu");
        }
        private void help(){
            System.out.println("A good way to start is to first write the exercise for example squats and then how much weight you will lift");
            System.out.println("I would then write the reps and then the sets. Here is what that would look like");
            System.out.println("Squats (80% of PB) 6 x 5");
            System.out.println("Press enter to keep on writing your program");
            input.nextLine();
        }
}
