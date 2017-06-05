package com.esubalew;

public class Main {

    public static void main(String[] args) {

        int n = 8;
        int factorial =1;

        while (n > 0){

            factorial = factorial * n;
            n = n-1;
        }

        System.out.println("Factorial= " + factorial);

    }
}
