package com.example.MultiThreading.MultiThreadingConcepts.TypesOfThreadCreation;

public class Example3 {
    public static void main(String[] args) {
        Thread one = new Thread(() -> {
            for(int i =0; i < 20; i++)
                System.out.println("In thread1 " + i);

        });

        Thread two = new Thread(() -> {
            for(int i = 0; i < 20; i++)
                    System.out.println("In thread2 " + i);
        });
        one.start();
        two.start();
    }
}
