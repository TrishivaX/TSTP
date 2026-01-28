package com.trishivax.javarevision;

public class PolymorphismTest {

    static void main(String[] args) {

    }
}
//two types of polymorphism
//1) Compile time : method overloading  ---> withing single class
//2) Run time polymorphism  : Method overriding ----> 2 classes :
// Parent and child ka relationship hona chahiye

class Mannu7{
    //(1) change the no of parameters
    void add(){
        System.out.println("Adding two integers");
    }

    // (2) if we want to keep the no of parameters same then change the data type
    void add(int a){
        System.out.println("Adding two integers");
    }

    void add(char a){
        System.out.println("Adding two integers");
    }

    //(3) if no of parameters and data types are also same then order of teh parameters
    //can be different
    void add(char a, int b){
        System.out.println("Adding two integers");
    }
    void add(int b, char a){
        System.out.println("Adding two integers");
    }

    //4rth rule
    //just changing the return type of the method will not be helping us out
    //to achieve compile time polymorphism
    /*void sub(){

    }
    int sub(){

    }*/
}


class Shiva1{
    protected void add(){
        System.out.println("Adding the details !!!!!!!!!!");
    }
}


class Shiva2 extends Shiva1{
    public void add(){
        System.out.println("99999999999");
    }
}
//donot add the lower visibility data access specifier before method in
// child class coming from parent class
//we shoudl not change the methods return type












