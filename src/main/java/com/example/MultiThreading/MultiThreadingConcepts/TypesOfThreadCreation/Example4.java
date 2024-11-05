package com.example.MultiThreading.MultiThreadingConcepts.TypesOfThreadCreation;

public class Example4 {
    public static void main(String[] args) {
        Thread one = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0; i < 20; i++)
                    System.out.println("In thread1 " + i);
            }
        });

        Thread two = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 20; i++)
                        System.out.println("In thread 2 " + i);
            }
        });

        one.start();
        two.start();
    }
}
