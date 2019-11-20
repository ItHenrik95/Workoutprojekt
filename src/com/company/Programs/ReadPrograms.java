package com.company.Programs;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadPrograms {

    public void readFile()  {
        System.out.println("What program would you like to read");
        Scanner input = new Scanner(System.in);
        String read = input.nextLine();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(read);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner in = new Scanner(fis);
        while(in.hasNext()){
            System.out.println(in.nextLine());
        }
        System.out.println("Press any key to enter the main menu");
        input.nextLine();
    }
}
