package com.example.MultiThreading.Synchronization;

public class WaitAndNotify {
    private static final Object LOCK = new Object();
    private static boolean isLocked = false;

    public static void main(String[] args) {
        Thread one = new Thread(() -> {
            locking();
        }, "Thread one");

        Thread two = new Thread(() -> {
            locking();
        }, "Thread two");

        Thread three = new Thread(() -> {
            locking();
        }, "Thread three");
        one.start();
        two.start();
        three.start();

        try{
            one.join();
            two.join();
            three.join();
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }

    }

    public static void locking(){
        synchronized (LOCK) {

            while (isLocked) {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " is waiting for the lock.");

            }
            System.out.println(Thread.currentThread().getName() + " is acquiring the lock.");
            isLocked = true;
        }

        try {

            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " is currently working with the lock.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized (LOCK){
            isLocked = false;
            LOCK.notify();
            System.out.println(Thread.currentThread().getName() + " has left the lock.");
        }


    }
}
