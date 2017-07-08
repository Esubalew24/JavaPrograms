package com.esubalew;

public class Main {

    public static void main(String[] args) {
        System.out.println(isTrivalent(new int[]{22, 19, 10, 10, 19, 22, 22, 10}));
        System.out.println(isTrivalent(new int[]{1, 2, 2, 2, 2, 2, 2}));
        System.out.println(isTrivalent(new int[]{2, 2, 3, 3, 3, 3, 2, 41, 65}));
        System.out.println(isTrivalent(new int[]{-1, 0, 1, 0, 0, 0}));
        System.out.println(isTrivalent(new int[]{}));
        System.out.println(isTrivalent(new int[]{2147483647, -1, -1, -2147483648}));
    }

    static int isTrivalent(int[] a) {

        int[] tempArray = new int[a.length];
        for (int i = 0; i < tempArray.length; i++)
            tempArray[i] = Integer.MIN_VALUE;

        int index = 0;
        for (int i=0; i<a.length; i++) {
            boolean flag = true;
            for (int j = 0; j < index; j++) {
                if (tempArray[j] == a[i]) {
                    flag = false;
                    break;
                }
                else {
                    flag = true;
                }
            }

            if (flag) {
                tempArray[index] = a[i];
                index++;
            }
        }

        if (index != 3) return 0;
        else return 1;
    }
}
