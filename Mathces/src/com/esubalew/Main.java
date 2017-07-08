package com.esubalew;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int mathces(int[] a, int[] p){

        for(int i=0; i< p.length; i++){

            int check = p[i];
            if( check > 0){
                for(int j=i; j<check; j++){
                    if(p[j] <0){
                        return 0;
                    }
                }
            }
        }
    }
}
