package com.esubalew;

public class Main {

    public static void main(String[] args) {


        isPerfectSquare(16);
        isPerfectSquare(-5);

        nextPerfectSquare(6);
        nextPerfectSquare(20);
        nextPerfectSquare(0);
        nextPerfectSquare(-24);
        nextPerfectSquare(-200);
        nextPerfectSquare(20);

        powerOfNumber(2,4);
        powerOfNumber(2,0);
    }

    // Checks if a number is a perfect square or not

    public static void  isPerfectSquare(int n){

        int a = (int) Math.sqrt(n);

        if(a * a == n){
            System.out.println("Number is perfect square");
        }
        else
        {
            System.out.println("Number is not perfect square");
        }
    }

    // Find the next perfect square

    public static int nextPerfectSquare(int n) {


        if(n >=0) {

            int sqrt = (int) Math.sqrt(n);

            int newNumber = sqrt + 1;
            int nextPerfectNumber = newNumber * newNumber;
            System.out.println("The next perfect number is  " + nextPerfectNumber);
        }

        else {
            System.out.println("The next perfect number is " + 0);
        }
        return 0;

    }

    // excute the power of a to b

    public static void powerOfNumber(int a, int b){
        int powerNumber = (int) Math.pow(a,b);
        System.out.println("Power of "+ a + " to " + b + " is " + powerNumber);

    }



}
