package com.esubalew;

public class Main {

    public static void main(String[] args) {

        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(-4));
        System.out.println(isSquare(8));
        System.out.println(isSquare(0));
        System.out.println(isSquare(1));


    }
    public static int isSquare(int n){

        for( int i=0; i<=n; i++){
            if( i*i == n){
                return 1;
            }
        }
        return 0;
    }

}
