package com.esubalew;

public class Main {

    public static void main(String[] args) {
        System.out.println(isNormal(0));
        System.out.println(isNormal(1));
        System.out.println(isNormal(2));
        System.out.println(isNormal(3));
        System.out.println(isNormal(4));
        System.out.println(isNormal(5));
        System.out.println(isNormal(6));
        System.out.println(isNormal(7));
        System.out.println(isNormal(8));
        System.out.println(isNormal(9));

        System.out.println(isNormal(10));
        System.out.println(isNormal(11));
        System.out.println(isNormal(12));
        System.out.println(isNormal(13));
        System.out.println(isNormal(14));
        System.out.println(isNormal(15));
        System.out.println(isNormal(16));
        System.out.println(isNormal(17));
        System.out.println(isNormal(18));
        System.out.println(isNormal(19));
        System.out.println(isNormal(20));

    }

    static int isNormal(int n) {
        for (int i = 2; i < n; i++) {
            int factor = 0;
            if (n % i == 0)
                factor = i;

            if (factor % 2 != 0)
                return 0;
        }
        return 1;
    }
}
