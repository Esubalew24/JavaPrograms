package com.esubalew;

public class Main {

    public static void main(String[] args) {
        System.out.println(isSelfReferential(new int[] {1, 2, 1, 0}));
        System.out.println(isSelfReferential(new int[] {2, 0, 0}));
        System.out.println(isSelfReferential(new int[] {0}));
        System.out.println(isSelfReferential(new int[] {1} ));

        System.out.println(isSelfReferential(new int[] {2, 0, 2, 0} ));
        System.out.println(isSelfReferential(new int[] {1} ));
        System.out.println(isSelfReferential(new int[] {5, 2, 1, 0, 0, 1, 0, 0, 0} ));
        System.out.println(isSelfReferential(new int[] {6, 2, 1, 0, 0, 0, 1, 0, 0, 0} ));



    }

    static int isSelfReferential(int a[ ]) {
        int count = 0;
    for(int i =0; i< a.length -1; i++){
        for(int j=0; j<a.length-1; j++)
        if(i == a[j]){
            count++;
        }

        if(count == a[i]){
            return 1;
        }
    }
    return 0;
    }
}
