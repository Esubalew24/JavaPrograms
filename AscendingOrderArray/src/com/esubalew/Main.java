package com.esubalew;

public class Main {

    public static void main(String[] args) {



        ascendingOrder(new int[] {4, 6, 7,5,8});
        descendingOrder(new int[] {344,9940,73,22,1000});


    }


    static void  ascendingOrder(int[] array){
        for(int i =0; i < array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

     for(int i =0; i<array.length; i++){
         System.out.println(array[i]);
     }

        System.out.println("-----------");
    }



    // Descending Order

    static void  descendingOrder(int[] array){
        for(int i =0; i < array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int i =0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
