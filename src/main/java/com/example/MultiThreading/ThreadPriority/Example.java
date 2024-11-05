package com.example.MultiThreading.ThreadPriority;


public class Example {
    public static void main(String[] args) {
        System.out.println("Hello from the " + Thread.currentThread().getName());
        Thread one = new Thread(() -> {
           System.out.println("Hello from " + Thread.currentThread().getName());
        }, "Thread One");

        Thread two = new Thread(() -> {
            System.out.println("Hello from " + Thread.currentThread().getName());
        }, "Thread Two");

        one.start();
        one.setPriority(Thread.MIN_PRIORITY);
        two.start();
        two.setPriority(Thread.MAX_PRIORITY);
    }
}
