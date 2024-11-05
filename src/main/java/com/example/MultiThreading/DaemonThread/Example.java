package com.example.MultiThreading.DaemonThread;
public class Example {
    public static void main(String[] args){
        Thread bgThread = new Thread(new DaemonHelper());
        Thread UserHelper = new Thread(new UserHelper());
        bgThread.setDaemon(true);
        UserHelper.start();
        bgThread.start();
    }
}

class DaemonHelper implements Runnable{
    @Override
    public void run() {
        int count = 0;
        while(count < 500){
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Daemon thread is running");
        }
    }
}

class UserHelper implements Runnable{
    @Override
    public void run() {
        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("User thread done with execution");
    }
}