package com.example.MultiThreading.Sequential;

class S1{
    public void demo(){
        for(int i  = 0; i < 5; i++)
            System.out.println("S1 " + i);
    }

}


class S2{
    public void demo(){
        for(int i =0; i < 5 ;i++){
            System.out.println("S2 " + i);
        }
    }
}

public class SequentialMain {
    public static void main(String[] args) {
        S1 s1 = new S1();
        S2 s2 = new S2();
        s1.demo();
        s2.demo();
    }
}
