package com.trishivax.javarevision;

public class ActivatationRecord {

    static void main(String[] args) {
        /*for(int i=0; i<10; i= i*2){
            System.out.println("9999999");
        }*/
                        //last value
        for(int i=1; i<100; i= i*2){
            System.out.println(111111);
        }


        // last value is 10 ---> 1 2 4 8(4 times)
        // last value is 50 ---> 1 2 4 8 16 32 (6 times)
        //last value is 100 ---> 1 2 4 8 16 32 64 (7 times)


    }

}


class MannuKP{

    //method is expecting some memory to be executings its works
    //stack par milta hai

    //Rule of activation record: control room of the function
    //in case of any function coming in the way of control flow , please give that function a special
    //memory and that memory will be traeted as activation record of the function.

    public void run(){
        for(int i=0;i <20; i++){

        }
    }
}