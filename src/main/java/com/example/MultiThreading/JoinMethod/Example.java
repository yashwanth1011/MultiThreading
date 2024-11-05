package com.example.MultiThreading.JoinMethod;

public class Example {
    public static void main(String[] args) throws InterruptedException{
        Thread one = new Thread(() -> {
            for(int i = 0; i < 20; i++)
                System.out.println("Thread 1 " + i);
        });

        Thread two = new Thread(() -> {
            for(int i = 0; i < 20; i++)
                System.out.println("Thread 2" + i);
        });

        System.out.println("Code before execution of the thread start");

        one.start();
        two.start();

        one.join();
        two.join();
        System.out.println("End of the Execution");

    }
}
