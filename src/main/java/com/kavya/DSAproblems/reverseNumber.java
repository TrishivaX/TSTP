package com.kavya.DSAproblems;

import java.util.Scanner;

public class reverseNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;
        while(num!= 0){
            int num2 = num % 10;
            reverse = reverse * 10 + num2;
            num = num/10;
        }
        System.out.println("Reversed number: "+ reverse);
        sc.close();
    }
}
