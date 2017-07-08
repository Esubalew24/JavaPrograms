package com.esubalew;

public class Main {

    public static void main(String[] args) {
        System.out.println(repsEqual(new int[]{3, 2, 0, 5, 3}, 32053));
        System.out.println(repsEqual(new int[]{3, 2, 0, 5}, 32053));
        System.out.println(repsEqual(new int[]{3, 2, 0, 5, 3, 4}, 32053));
        System.out.println(repsEqual(new int[]{4, 3, 2, 0, 5, 3}, 32053));
        System.out.println(repsEqual(new int[]{2, 3, 0, 5, 3}, 32053));
        System.out.println(repsEqual(new int[]{9, 3, 1, 1, 2}, 32053));
        System.out.println(repsEqual(new int[]{0, 3, 2, 0, 5, 3}, 32053));
    }

    static int repsEqual(int[] a, int n) {
        for (int i = a.length - 1; i >= 0; i--) {
            int rem = n % 10;
            n = n / 10;

            if (a[i] != rem)
                return 0;
        }

        if (n != 0)
            return 0;
        else
            return 1;
    }
}
