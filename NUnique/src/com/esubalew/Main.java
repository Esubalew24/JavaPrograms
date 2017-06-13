package com.esubalew;

public class Main {

    public static void main(String[] args) {

        System.out.println(isNUnique(new int[] {2, 7, 3, 4}, 5));
        System.out.println(isNUnique(new int[] {2, 3, 3, 7}, 5));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 6));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 10));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 11));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 8));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 4));
        System.out.println(isNUnique(new int[]{1}, 4));

    }

    static int isNUnique(int[] a, int n) {
        if (a.length >= 2) {
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] + a[j] == n)
                        count++;
                    if (count > 1)
                        return 0;
                }
            }

            if (count == 1)
                return 1;
            else return 0;
        }

        return 0;
    }
}
