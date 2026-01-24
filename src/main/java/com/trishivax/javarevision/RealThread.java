package com.trishivax.javarevision;

public class RealThread {

    static void main(String[] args) {
        System.out.println("This is the first line.");//ThreadScheduler has 1 thread : main thread

        // we have to create multiple threads via code bases
        Thread mannukaThread = new Thread(new Mannu3());//ThreadScheduler has 1 thread : main thread
        Thread kavyakaThread = new Thread(new Kavya3());//ThreadScheduler has 1 thread : main thread
        Thread sailkaThread = new Thread(new Sail3());//ThreadScheduler has 1 thread : main thread
        Thread vinitkaThread = new Thread(new Vinit3());//ThreadScheduler has 1 thread : main thread
        Thread soniakaThread = new Thread(new Sonia3());//ThreadScheduler has 1 thread : main thread

        mannukaThread.start();//ThreadScheduler has 2 thread : main thread, mannukathread
        kavyakaThread.start();//ThreadScheduler has 3 thread : main thread, mannukathread, kavyakathread
        sailkaThread.start();//ThreadScheduler has 4 thread : main thread, mannukathread, kavyakathread, sailkathread
        vinitkaThread.start();//ThreadScheduler has 5 thread : main thread, mannukathread, kavyakathread, sailkathread, vinitkathraed
        soniakaThread.start();
            //ThreadScheduler has 6 thread : main thread, mannukathread, kavyakathread, sailkathread, vinitkathraed,soniakathread

        //below work would be done by main thread
        for(int i=0; i<50; i++){
            System.out.println("mainthread is working here.......");
        }
        System.out.println("This is the last line.");
    }
}

//Here onec class mannu3 implemented Runnable interface
//It can be behaving as a thread object
class Mannu3 implements Runnable{
    @Override
    public void run() {
        for(int i= 0; i<50; i++){
            System.out.println("Mannu will work on coding today !!!!!");
        }


    }
}

class Kavya3 implements Runnable{
    @Override
    public void run() {
        for(int i= 0; i<50; i++){
            System.out.println("Kavya is running !!!!!");
        }
    }
}

class Sail3 implements Runnable{
    @Override
    public void run() {
        for(int i= 0; i<50; i++){
            System.out.println("Sail is reading a book !!!!!");
        }
    }
}
class Vinit3 implements Runnable{
    @Override
    public void run() {
        for(int i= 0; i<50; i++){
            System.out.println("VInit is playing cricket !!!!!");
        }
    }
}
class Sonia3 implements Runnable{
    @Override
    public void run() {
        for(int i= 0; i<50; i++){
            System.out.println("Sonia is reading maths !!!!!");
        }
    }
}