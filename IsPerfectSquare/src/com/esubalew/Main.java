package com.esubalew;

public class Main {


    public static void main(String[] args) {

        System.out.println(nextPerfectSquare2(6));
        System.out.println(nextPerfectSquare2(36));
        System.out.println(nextPerfectSquare2(0));
        System.out.println(nextPerfectSquare2(-5));

        System.out.println("------");

        System.out.println(nextPerfectSquare(6));
        System.out.println(nextPerfectSquare(36));
        System.out.println(nextPerfectSquare(0));
        System.out.println(nextPerfectSquare(-5));

        System.out.println("------");

        System.out.println(isPerfectSquare(4));
        System.out.println(isPerfectSquare(10));

        System.out.println("------");

        System.out.println(primeNumberCheck(9));
        System.out.println(primeNumberCheck(7));
        System.out.println(primeNumberCheck(39));
        System.out.println(primeNumberCheck(-109));

        System.out.println("------");

        System.out.println(factorial(5));
        System.out.println(factorial(25));
        System.out.println(factorial(4));

        System.out.println("------");


    }

    /*
    * Solution using Do While loop
     */

    static int nextPerfectSquare2(int n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;
        int square;
        int number = 1;

        do {
            square = number * number;
            number++;
        } while (square <= n);
        return square;
    }

    /*
    *    OR Alternative solution using for loop
     */

    static int nextPerfectSquare(int n) {
        int nextPerfectSquare = 1;

        if (n < 0)
            return 0;
        else if (n == 0)
            return 1;

        for (int i = 0; i < n; i++)
            if (i * i > n) {
                nextPerfectSquare = i * i;
                break;
            }

        return nextPerfectSquare;
    }
// Checks if a number is Perfect Square

    static int isPerfectSquare(int n){
        for(int i=0; i<n; i++){
            if(i*i == n){
                return 1;
            }
        }
        return 0;
    }

    // Checks weather a given number is prime number or not

    public static int primeNumberCheck(int num)
    {

        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {

                return 0;
            }
        }
        return 1;
    }


    public static int factorial(int n){
        int factorial=1;
        for(int i=1; i<=n; i++){
            factorial = factorial *i;
        }
        return factorial;
    }

}
