package com.esubalew;

public class Main {

    public static void main(String[] args) {

        System.out.println(isVanilla(new int[]{1,11,111,2111}));
        System.out.println(isVanilla(new int[]{1, 1, 11, 1111, 1111111}));
        System.out.println(isVanilla(new int[]{1}));
        System.out.println(isVanilla(new int[]{11, 22, 13, 34, 125}));
        System.out.println(isVanilla(new int[]{9, 999, 99999, -9999}));

    }

    public static int isVanilla(int[] a){s
        for(int i=0;i<a.length;i++){
            while(a[i]>10){
                int rem=a[i]%10;
                a[i]=a[i]/10;
                if(k!=rem){
                    return 0;
                }

            }
            if(k!=a[i]){
                return 0;
            }
        }
        return 1;
    }
}
