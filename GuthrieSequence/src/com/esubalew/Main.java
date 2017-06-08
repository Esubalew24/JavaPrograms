package com.esubalew;

public class Main {

    public static void main(String[] args){
        int result = isGuthrieSequence(new int[] {8, 4, 2, 1});
        System.out.println(result);
        result = isGuthrieSequence(new int[] {8, 17, 4, 1});
        System.out.println(result);
        result = isGuthrieSequence(new int[] {8, 4, 1});
        System.out.println(result);
        result = isGuthrieSequence(new int[] {8, 4, 2});
        System.out.println(result);
        result = isGuthrieSequence(new int[] {7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1});
        System.out.println(result);

        System.out.println(isGuthrieSequence(new int[] {8, 4, 2, 1}));
        System.out.println(isGuthrieSequence(new int[] {8, 17, 4, 1}));
        System.out.println(isGuthrieSequence(new int[] {8, 4, 1}));
        System.out.println(isGuthrieSequence(new int[] {8, 4, 2}));
        System.out.println(isGuthrieSequence(new int[] {7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1}));



    }

    static int isGuthrieSequence(int[] a){
        int isGuthrieSequence = 0;
        int nextSequenceNumber = a[0];
        if(a[a.length - 1] == 1){
            for(int i = 0; i < a.length; i++){
                if(nextSequenceNumber == a[i]){
                    isGuthrieSequence = 1;
                    if(a[i] % 2 == 0 ){
                        nextSequenceNumber = a[i] / 2;
                    }else{
                        nextSequenceNumber = a[i] * 3 + 1;
                    }
                }else{
                    isGuthrieSequence = 0;
                    break;
                }
            }
        }
        return isGuthrieSequence;
    }

    static int isGuthrieSequence2(int[] a) {
        if (a[a.length - 1] != 1)
            return 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] % 2 == 0) {
                if (a[i + 1] != (a[i] / 2))
                    return 0;
            } else {
                if (a[i + 1] != ((a[i] * 3) + 1))
                    return 0;
            }
        }
        return 1;
    }

}
