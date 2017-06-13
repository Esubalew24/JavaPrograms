package com.esubalew;

public class Main {

    public static void main(String[] args) {
        System.out.println(convertToBase10(new int[  ] {1, 0, 1, 1}, 2));
        System.out.println(convertToBase10(new int[  ] {1, 1, 2}, 3));
        System.out.println(convertToBase10(new int[  ] {3, 2, 5}, 8));
        System.out.println(convertToBase10 (new int[ ] {3, 7, 1},  6));
    }

    public static int isLegalNumber(int[  ] a, int base) {

        for (int i = 0; i < a.length; i++) {

            if (!(a[i] < base)) {
                return 0;
            }

        }

        return 1;

    }


    public static int convertToBase10(int[  ] a, int base) {


        int isLegalNumber = isLegalNumber(a , base);

        if (isLegalNumber != 1) return 0;

        int sum = 0;
        int sup = 0;
        int mul = 0;

        for (int i = a.length - 1; i >= 0; i--) {


            if (sup == 0)
                mul = 1;
            else
                mul *= base;


            sum += (a[i] * mul);

            sup++;

        }


        return sum;
    }

}
