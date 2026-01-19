package com.trishivax.javarevision;

public class DataTypes {

    static void main(String[] args) {
        //Here created an obejct of Object class itself
        //super parent class of any java class
        Object ob = new Object();
        //below are the widelky used methods present in Object class
        //equals(), hashcode(), toString(), wait(), notify(), notifyAll()

        //creating an object of XYZ
        XYZ x = new XYZ();
        //to get the class name from any of the objects
        System.out.println(x.getClass().getName());//we are getting actual class chich has created this object
        System.out.println(x.getClass().getSuperclass().getName());//we are getting parent class of any object

        //data types
        //premitive and non primitive

        int a = 2147483647;  //Wrapper class : Integer
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        long dddd= 1222;//Long
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        char c = 's'; //Character
        boolean flag = false; //Boolean
        float dd = 10.6f;//Float
        double ddd= 10.9d;//Double

        //if we want to convert one primitive daat type info into ints wrapper class object
        int q = 11;
        Integer ss = new Integer(q);

        //Auto boxing -=---> Adding the wrappers on primitive data types
        //Auto Unboxing ---> Removing the wrapper objects from any info and bringing that back to
        //its primitive data type








    }

}

class XYZ{

}




//Object ---> inbuilt class in JAVA : -- default parent class of any class in java


