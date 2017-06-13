package com.esubalew;

public class Main {

    public static void main(String[] args) {

        System.out.println(isStacked(1));
        System.out.println(isStacked(3));
        System.out.println(isStacked(6));
        System.out.println(isStacked(10));
        System.out.println(isStacked(15));
        System.out.println(isStacked(7));
        System.out.println(isStacked(8));
        System.out.println(isStacked(9));
    }

    static int isStacked(int n) {
        int number = 1;
        int sum = 0;
        while (sum < n) {
            sum += number;
            number++;
        }
        if (sum == n) return 1;
        return 0;
    }

}
