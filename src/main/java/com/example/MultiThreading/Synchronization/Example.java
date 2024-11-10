package com.example.MultiThreading.Synchronization;

public class Example {
    private static int counter = 0;
    public static void main(String[] args) {

        Thread one = new Thread(() -> {
            for(int i = 0; i < 100000; i++)
                increment();
        });
        Thread two = new Thread(() -> {
            for(int i = 0; i < 100000; i++)
                increment();
        });
        one.start();
        two.start();
        try{
            one.join();
            two.join();
        }catch(Exception e){
           throw new RuntimeException(e);
        }

        System.out.println(counter);
    }

    public static synchronized void increment(){
        counter++;
    }
}

