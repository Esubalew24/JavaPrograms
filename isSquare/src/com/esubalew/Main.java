package com.esubalew;

public class Main {

    public static void main(String[] args) {

        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(-4));
        System.out.println(isSquare(8));
        System.out.println(isSquare(0));

    }

    public static int isSquare(int n) {
        if (n < 0)
            return 0;

        int square = 0;
        int number = 1;

        while (square < n) {
            square = number * number;
            number++;
        }

        if (square == n)
            return 1;

        return 0;
    }


}
