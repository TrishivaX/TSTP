package com.trishivax.javarevision;

public class InheritenceTest {
    static void main(String[] args) {
        Mannu6 m = new Mannu6();

        Vinit v = new Vinit();

    }
}

//we can not inherit the properties of Final class
// variables or methods declared with private keyword will not participate in inheritance

class Mannu6{
    // 3 member variables and two methods

    private String name = "Mannu ";
    String address = "Bangalore";
    String mobile = "9999999";

    private void playCricket(){
        System.out.println("Playing cricket");
    }
    void readingBooks(){
        System.out.println("Reading a book !");
    }
}

//Vinit - child Mannu6 - Parent Class
class Vinit extends Mannu6{

}
class HH{

}
class Raj extends Vinit{

}

class Shyam2 extends Vinit{

}