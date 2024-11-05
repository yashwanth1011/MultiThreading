package com.example.MultiThreading.MultiThreadingConcepts.TypesOfThreadCreation;

class Thread1 extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 10; i++)
            System.out.println("thread1 " + i);
    }
}

class Thread2 extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 15; i++)
            System.out.println("thread2 " + i);
    }
}

public class Example1 {
    public static void main(String[] args) {
        Thread1 one  = new Thread1();
        one.start();

        Thread2 two = new Thread2();
        two.start();

    }
}
