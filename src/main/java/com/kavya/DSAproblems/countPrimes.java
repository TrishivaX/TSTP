package com.kavya.DSAproblems;

import java.util.Scanner;

public class countPrimes {

    static boolean[] isComposite;

    //  Precompute primes using Sieve
    public static void precompute(int n) {
        isComposite = new boolean[n];
        int limit = (int) Math.sqrt(n);

        for (int i = 2; i <= limit; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j < n; j += i) {
                    isComposite[j] = true;
                }
            }
        }
    }

    // 🔹 Use precomputed data to count primes
    public static int CountPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        precompute(n);
        System.out.println("Number of primes less than " + n + " = " + CountPrimes(n));

        sc.close();
    }
}
