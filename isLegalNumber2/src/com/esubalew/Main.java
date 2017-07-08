package com.esubalew;

public class Main {

    public static void main(String[] args) {
        System.out.println(isLegalNumber(new int[]{3, 2, 1},  4));
        System.out.println(isLegalNumber(new int[]{3, 7, 1},  6));
        System.out.println(isLegalNumber(new int[]{-3, 3, 1},  6));

        System.out.println(convertToBase10(new int[]{1, 0, 1, 1}, 2));
        System.out.println(convertToBase10(new int[]{1, 1, 2}, 3));
        System.out.println(convertToBase10(new int[]{3, 2, 5}, 8));
        System.out.println(convertToBase10(new int[]{3, 7, 1}, 6));


    }

    static int isLegalNumber(int[] a, int base) {
        for (int i=0; i<a.length; i++) {
            if (a[i] < 0 || a[i] >= base)
                return 0;
        }
        return 1;
    }


    public static int convertToBase10(int[] a, int base) {

        if (isLegalNumber(a, base) == 1) {

            int sum = 0;
            for (int i = 0; i < a.length; i++) {

                int power = 1;
                for (int j = i + 1; j < a.length; j++) {

                    power = base * power;
                }

                sum = sum + a[i] * power;
            }
            return sum;

        }
        return -1;

    }

}
