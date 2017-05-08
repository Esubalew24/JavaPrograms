package com.esubalew;

public class Main {

    public static void main(String[] args) {

        nUpCount(new int[]{2, 3, 1, -6, 8, -3, -1, 2}, 5);
        nUpCount(new int[]{6, 3, 1}, 6);
        nUpCount(new int[]{1, 2, -1, 5, 3, 2, -3}, 20);


    }

    public static int nUpCount(int[] numbers, int n) {

        int upCountSum = 0;
        int previousSum = 0;
        int ntCount = 0;

        for (int i = 0; i < numbers.length; i++) {

            previousSum = upCountSum;
            upCountSum = upCountSum + numbers[i];
            if (upCountSum > n && previousSum <= n) {
                ntCount++;
            }
        }

        System.out.println(ntCount);
        return ntCount;

    }
}


