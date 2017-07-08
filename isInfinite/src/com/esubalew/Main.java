package com.esubalew;

public class Main {

    public static void main(String[] args) {

        System.out.println(isInfinite(new int[]{1, 2, -1, 5}));
        System.out.println(isInfinite(new int[]{1, 2, 4, -1}));
        System.out.println(isInfinite(new int[]{5, 3, 4, -1, 1, 2}));
        System.out.println(isInfinite(new int[]{3}));
        System.out.println(isInfinite(new int[]{3, 2, 3, 1}));
        System.out.println(isInfinite(new int[]{0}));
        System.out.println(isInfinite(new int[]{-1}));



        System.out.println(isInfinite(new int[]{3, 2, 3, 1, 4 ,5,5,5,5,-5}));
    }

    public static int isInfinite(int[] a){

        boolean flag= false;
        for(int i=0; i<a.length; i++){

            if(a[i]== -1){
                return -1;
            }

            else if (a[i] < -1 || a[i] >= a.length){
                return 1;
            }

            else {

                flag = true;

                if(flag==true)

                for(i=0; i<a.length; i++){
                    if(a[i]== -1){
                        return -1;
                    }
                    else if (a[i] < -1 || a[i] >= a.length){
                        return 1;
                    }

                    else {
                        flag =true;
                    }
                }
            }
        }

        return 0;
    }
}
