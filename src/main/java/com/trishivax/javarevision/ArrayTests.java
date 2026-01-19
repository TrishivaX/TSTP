package com.trishivax.javarevision;

public class ArrayTests {
    static void main(String[] args) {
        //Array data structure in JAVA : store same types of information
        //it is in nature of fixed size
        //array size can not be decreased or increased in same manner
        //first way of creating array in java
        //It requires regular memory over here to stroe info
        //Internally there would be an indexing happened
        //direct removal of an index (memory) from objects of any array in java is not possible

        //first there was a count of all elements , then memory allocation
        //on basis of the respective object counts
        //all the elements got added there
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int arr2[] = {1,2,3,4,5,6,7,8,9,10};

        //second manner
        //we are initilizing the object with its expected memory size
        int[] arr3 = new int[10];
        arr3[0] = 11;
        arr3[1] = 12;
        //...........


        //reading the elements present in the array
        for(int i=0; i<10; i++){
            System.out.println(arr1[i]);
        }


        long []ll = {1,2,3,4,5,6,7,8,9,10};


        String ssss[] = {"abc","def","ghi"};
        String[] ss = new String[100];


    }
}
