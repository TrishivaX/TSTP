package com.trishivax.javarevision;

import java.util.Arrays;

public class RandomOperaqtionsOnArray {

    static void main(String[] args) {
        //integers array: It cann have eitehr 0 1 2
        //problem : sort this array without using any sorting
        int[] arr = {0,1,2,0,1,1,1,1,1,2,2,2,0,0,2};
        int zeroc = 0; //4
        int onec = 0;  //6
        int twoc = 0;  //5
        //now traverse the array to figure out how many time 0, 1  2 are present
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                zeroc++;
            }else if(arr[i] == 1){
                onec++;
            }else{
                twoc++;
            }
        }

        //arrange the array in count wise manner
        //keep all zeros first : zeroc time
        for(int i= 0; i<zeroc; i++){
            arr[i] = 0;
        }

        //all ones would be placed now
        for(int i= 0; i< onec; i++){
            arr[zeroc+i]  = 1;
        }

        //all twos would be placed now
        for(int i= 0; i< twoc; i++){
            arr[zeroc+onec+i]  = 2;
        }


        System.out.println(Arrays.toString(arr));

    }
}
