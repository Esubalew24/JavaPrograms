package com.esubalew;

public class Main {

    public static void main(String[] args) {
        System.out.println(a1(new int[]{1, 2, 3, 4}));;
        System.out.println(a1(new int[]{4, 1, 2, 3}));
        System.out.println(a1(new int[]{1, 1, 2, 2,5,8,22}));
        System.out.println(a1(new int[]{1, 1}));
        System.out.println(a1(new int[]{1}));;
        System.out.println(a1(new int[]{}));
    }

    static int a1(int[] a)
    {
        int max1 = -1;
        int max2 = -1;

        for (int i=0; i<a.length; i++)
        {
            if (a[i] > max1)
            {
                max2 = max1;
                max1 = a[i];
            }
            else if (a[i] != max1 && a[i] > max2)
                max2 = a[i];
        }

        return max2;
    }
}
