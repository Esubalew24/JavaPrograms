package com.esubalew;

public class Main {

    public static void main(String[] args) {
        System.out.println(solve10());

        }

    public static int[] solve10() {

        int n = 1;
        int m = 10;
        int a = 1 ;
        int b = 1;
        int k = 1;

        int[] z = new int[3];

        for (int i = 1; i <= m; i++) {
            n *= i;
        }

        while (k <= m) {

            a = a *  k;
            b = 1;

            for (int j = 1; j <= m; j++) {
                b = b * j;
                if (a + b == n) {
                    z[0] = k;
                    z[1] = j;
                    z[2] = n;
                    return z;
                }

            }
            k++;
        }

        return z;
    }




}
