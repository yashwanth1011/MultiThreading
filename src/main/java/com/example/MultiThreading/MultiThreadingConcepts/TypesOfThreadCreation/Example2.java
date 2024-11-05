package com.example.MultiThreading.MultiThreadingConcepts.TypesOfThreadCreation;

class ThreadR1 implements Runnable{

    @Override
    public void run() {
        for(int i =0; i < 20; i++)
            System.out.println("Thread1 " + i);
    }
}

class ThreadR2 implements Runnable{

    @Override
    public void run() {
        for(int i =0; i < 20; i++)
            System.out.println("Thread2 " + i);
    }
}

public class Example2 {
    public static void main(String[] args) {
        Thread one = new Thread(new ThreadR1());
        Thread two = new Thread(new ThreadR2());
        one.start();
        two.start();

    }
}
