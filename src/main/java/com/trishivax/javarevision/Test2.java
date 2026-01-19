package com.trishivax.javarevision;

public class Test2 {
    static void main(String[] args) {
        new Shyam().takingMoneyFromMannu();
    }
}

//To take the permission from one object to use its belongings
// we create the object

//class in java is replication of real word objects
//JAVA is an object oriented programming Language

// Private protected default, public---data access specifier
// ---lockers of the data (properties of the real objects)

//Data types ---> places where data or information or koi bhi chij can be placed
//Holders of the data ---> int , string , float, doubles
class Mannu{
    //private int money; //100
    String mobile;
}



class Shyam{
    public void takingMoneyFromMannu(){
        //asking for the permission from Mannu
        //Technically -> creating object of Mannu Class
        Mannu m = new Mannu();
        System.out.println("0000000000000000000000");
        System.out.println("0000000000000000000000");
        System.out.println("0000000000000000000000");
        System.out.println("0000000000000000000000");
        System.out.println("0000000000000000000000");
        System.out.println("0000000000000000000000");

        System.out.println(100/0);
        //[1 2 3 4 5 6 7 8 9 10]


        //FileNotFound Exception

        System.out.println("0000000000000000000000");
        System.out.println("0000000000000000000000");
        System.out.println("0000000000000000000000");
        System.out.println("0000000000000000000000");
        System.out.println("0000000000000000000000");
        System.out.println("0000000000000000000000");

        System.out.println(m.mobile);
       // System.out.println(m.money);
    }
}