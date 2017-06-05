package com.esubalew;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        maximumNumber(new int[] {2, 4, 5, 6, 7, 10});

    }

       static void maximumNumber(int[] ArrayList){
       int max = ArrayList[0];
        for(int i = 1; i< ArrayList.length; i++){
            if(ArrayList[i] > max){
                max =ArrayList[i];

         }
        }
        System.out.println("The maximum number in the array is: " + max);
    }
}
