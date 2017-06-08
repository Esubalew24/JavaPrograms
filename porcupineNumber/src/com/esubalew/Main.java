package com.esubalew;

public class Main {

    public static void main(String[] args) {

        System.out.println(findPorcupineNumber(0));
        System.out.println(findPorcupineNumber(138));
        System.out.println(findPorcupineNumber(139));
        System.out.println(findPorcupineNumber(409));
        System.out.println(findPorcupineNumber(900));

    }
    static int findPorcupineNumber(int n) {
        for (int i = n + 1; n < Integer.MAX_VALUE; i++) {
            if (isPrime(i)) {
                if (i % 10 == 9) {
                    for (int j = i + 1; j < Integer.MAX_VALUE; j++) {
                        if (isPrime(j)) {
                            if (j % 10 == 9)
                                return i;
                            else {
                                i = j;
                                break;
                            }
                        }
                    }
                }
            }
        }

        return 0;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return n > 1;
    }


}
