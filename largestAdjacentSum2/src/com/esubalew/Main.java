package com.esubalew;

public class Main {

    public static void main(String[] args) {
        System.out.println(largestAdjacentSum(new int[] {1, 2, 3, 4}));
        System.out.println(largestAdjacentSum(new int[] {18, -12, 9, -10}));
        System.out.println(largestAdjacentSum(new int[] {1,1,1,1,1,1,1,1,1}));
        System.out.println(largestAdjacentSum(new int[] {1,1,1,1,1,2,1,1,1}));
    }

    public static int largestAdjacentSum(int[] a){
        int sum= a[0] + a[1];
        for(int i=0; i<a.length-1;i++){
            if(a[i] + a[i+1]> sum){
                sum = a[i] +a[i+1];
            }
        }
        return sum;
    }
}
