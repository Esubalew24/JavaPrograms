package com.esubalew;

public class Main {

    public static void main(String[] args) {

        System.out.println(isOddHeavy(new int[]{11, 4, 9, 2, 8}));
        System.out.println(isOddHeavy(new int[]{11, 4, 9, 2, 3, 10}));
        System.out.println(isOddHeavy(new int[]{1}));
        System.out.println(isOddHeavy(new int[]{2}));
        System.out.println(isOddHeavy(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(isOddHeavy(new int[]{2, 4, 6, 8, 11}));
        System.out.println(isOddHeavy(new int[]{-2, -4, -6, -8, -11}));

    }

    static int isOddHeavy(int[] a) {
        boolean oddFlag = false;
        int smallestOdd = Integer.MAX_VALUE;
        int largestEven = Integer.MIN_VALUE;

        for (int i=0;i<a.length;i++) {
            if (a[i] % 2 != 0) {
                oddFlag = true;

                if (a[i] < smallestOdd)
                    smallestOdd = a[i];
            } else {
                if (a[i] > largestEven)
                    largestEven = a[i];
            }
        }

        if (oddFlag && smallestOdd > largestEven)
            return 1;
        else return 0;
    }

}
