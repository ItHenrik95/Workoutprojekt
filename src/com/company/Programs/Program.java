package com.company.Programs;


public class Program {

    public void timmer40sec(){
        for (int x = 1; x < 41; x++){
            System.out.println(x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void timmer60sec(){
        for (int x = 1; x < 61; x++){
            System.out.println(x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
