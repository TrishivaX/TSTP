package com.trishivax.javarevision;

public class Thread1 {

    static void main(String[] args) {
        //Control which is coming from OS to execute our code bases
        //Its name is main thread
        //Thread scheduelr is controlling this main thread
        //As of now onely one main thraed is available with Thread scheduler
        //Thread scheduler can have n number of threads
        System.out.println("11111111111111111");

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

        System.out.println("22222222222222222222222");
    }
}
