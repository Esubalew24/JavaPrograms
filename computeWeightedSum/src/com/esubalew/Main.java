package com.esubalew;

public class Main {

    public static void main(String[] args) {

        System.out.println(computeWeightedSum(new int[]{1, 2, 3, 4, 5}));
        System.out.println(computeWeightedSum(new int[]{1, 3, 5}));
        System.out.println(computeWeightedSum(new int[]{2, 4, 6}));
        System.out.println(computeWeightedSum(new int[]{1}));
        System.out.println(computeWeightedSum(new int[]{2}));
        System.out.println(computeWeightedSum(new int[]{0, 0, 0, 0, 0}));
    }

    static int computeWeightedSum(int a[ ]){
        int evenSum =0;
        int oddSum = 0;
        int weightedSum = 0;
        for(int i=0; i<a.length; i++){

            if(a[i] % 2 == 0)
                evenSum= evenSum + a[i];
            else
                oddSum = oddSum + a[i];
        }
        weightedSum = (2 * evenSum) + (3 * oddSum);

        return weightedSum;
    }

}
