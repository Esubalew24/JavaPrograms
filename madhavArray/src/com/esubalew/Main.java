package com.esubalew;

public class Main {

    public static void main(String[] args) {

        System.out.println(isMadhavArray(new int[]{2, 1, 1}));
        System.out.println(isMadhavArray(new int[]{2, 1, 1, 4, -1, -1}));
        System.out.println(isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
        System.out.println(isMadhavArray(new int[]{18, 9, 10, 6, 6, 6}));
        System.out.println(isMadhavArray(new int[]{-6, -3, -3, 8, -5, -4}));
        System.out.println(isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1}));
        System.out.println(isMadhavArray(new int[]{3, 1, 2, 3, 0}));

    }

    static int isMadhavArray(int[] a) {
        boolean correctLength = false;
        int n = 2;
        double checkLength = 1;
        while (checkLength <= a.length) {
            checkLength = n * (n + 1) / 2.0;
            if (checkLength == a.length) {
                correctLength = true;
                break;
            }
            n++;
        }
        if (!correctLength) return 0;
        int index = 1;
        for (int i = 2; index < a.length; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                sum += a[index];
                index++;
            }
            if (sum != a[0]) return 0;
        }
        return 1;
    }
}
