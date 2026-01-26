package com.vinit;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class PrimeCount
{
    public static void main(String[] args)
    {
        System.out.print("Enter Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;
        ArrayList<Integer> primes = new ArrayList<Integer>();
        int count = 0;
        for (int i = 2; i <= n; i++)
        {
            boolean AssumePrime = true;
            for(int j = 2; j*j <= i; j++)
            {
                if(i % j == 0)
                {
                    AssumePrime = false;
                    break;
                }
            }
            if(AssumePrime)
            {
//                int [] arr = new int[20]; for Stataic Array
//                arr[p++] = i;
                primes.add(i); //for dyamnic
            }

        }

//        System.out.println(p);
        System.out.println(primes.size());
    }

}
