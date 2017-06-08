package com.esubalew;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumFactor(new int[] {3, 0, 2, -5, 0}));
        System.out.println(sumFactor(new int[] {9, -3, -3, -1, -1}));
        System.out.println(sumFactor(new int[] {1}));
        System.out.println(sumFactor(new int[] {0, 0, 0}));

    }

    static int sumFactor(int[] a){
        int sumFactor = 0;
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        for(int i = 0; i < a.length; i++){
            if(a[i] == sum){
                sumFactor++;
            }
        }
        return sumFactor;
    }

}
