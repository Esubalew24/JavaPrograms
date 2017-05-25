package com.esubalew;

public class Main {

    public static void main(String[] args) {
        int number = 34521;
        int sum = 0;

        while(number > 0){
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;

        }
        System.out.println("Sum of the digits = " + sum);
    }
}
