package com.esubalew;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        // Java Program to check if a number is  Even or Odd number

        int number;
        System.out.print("Enter number: ");

        Scanner scanner = new Scanner(System.in);

        number = scanner.nextInt();

        if(number %2 ==0){
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }

    }
}
