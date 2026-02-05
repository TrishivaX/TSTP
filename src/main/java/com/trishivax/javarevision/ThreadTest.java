package com.trishivax.javarevision;

public class ThreadTest {
    static void main() {
        Thread mannuThread = new Thread(new Mannu5());
        Thread vinitThread = new Thread(new Vinit5());
        Thread soniaThread = new Thread(new Sonia5());
        mannuThread.start();
        vinitThread.start();
        soniaThread.start();

        System.out.println(Thread.currentThread().getState());
        for(int i = 0; i<100; i++){
            System.out.println("main thread is running");
        }
    }
}


class Mannu5 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i<100; i++){
            System.out.println("Mannu is running");
        }
    }
}

class Vinit5 implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i<100; i++){
            System.out.println("Vinit is walking");
        }
    }
}

class Sonia5 implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i<100; i++){
            System.out.println("Sonia is reading");
        }
    }
}