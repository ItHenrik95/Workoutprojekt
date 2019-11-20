package com.company.Calories;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CaloriCalculater  implements Calories  {
    double value;
    Scanner input = new Scanner(System.in);
    @Override
    public double carbohydrates() {
        System.out.println("How much gram of carbohydrates is in the product?");
        double i = 0;
       try {
           i = input.nextDouble();
       }
       catch (InputMismatchException e){
           e.printStackTrace();
       }
        value = i * 4;
        return value;

    }

    @Override
    public double protein() {
        System.out.println("How much gram of protein is in the product?");
        double i = 0;
        try {
            i = input.nextDouble();
        }
        catch (InputMismatchException e){
            e.printStackTrace();
        }
        value = i * 4;
        return value;
    }

    @Override
    public double fat() {
        System.out.println("How much gram of fat is in the product?");
        double i = 0;
        try {
            i = input.nextDouble();
        }
        catch (InputMismatchException e){
            e.printStackTrace();
        }
        value = i * 8;
        return value;
    }

    @Override
    public double mix() {// kolla över detta igen. går det göra snyggare?
        System.out.println("How much gram of carbohydrates is in the product?");
        double carbs = 0;
        try {
            carbs = input.nextDouble();
        }
        catch (InputMismatchException e){
            e.printStackTrace();
        }
        System.out.println("How much gram of protein is in the product?");
        double prot = 0;
        try {
            prot = input.nextDouble();
        }
        catch (InputMismatchException e){
            e.printStackTrace();
        }
        System.out.println("How much gram of fat is in the product?");
        double fats = 0;
        try {
            fats = input.nextDouble();
        }
        catch (InputMismatchException e){
            e.printStackTrace();
        }
        double car; double pro; double fat;
         car = carbs * 4;
         pro = prot * 4;
         fat = fats * 8;
        value = car + pro + fat;
        return value;
    }

}
