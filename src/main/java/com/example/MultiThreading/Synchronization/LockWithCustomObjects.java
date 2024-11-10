package com.example.MultiThreading.Synchronization;

public class LockWithCustomObjects {
    private static int counter1 = 0, counter2 = 0;

    private final static  Object lock1 = new Object();
    private final static Object lock2 = new Object();
    public static void main(String[] args) {
        Thread one = new Thread(() -> {
            for(int i =0;i < 100000; i++)
                    increment1();
        });

        Thread two = new Thread(() -> {
            for(int i =0; i < 100000; i++)
                    increment2();
        });

        one.start();
        two.start();
        try{
            one.join();
            two.join();
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println(counter1+ " -- " + counter2);
    }

    private static void increment1(){
        synchronized (lock1){
            counter1++;
        }
    }

    private static void increment2(){
        synchronized (lock2){
            counter2++;
        }
    }
}
