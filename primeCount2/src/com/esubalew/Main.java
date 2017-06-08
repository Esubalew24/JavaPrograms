package com.esubalew;

public class Main {
/*
Write a function named primeCount with signature
int primeCount(int start, int end);
The function returns the number of primes between start and end inclusive. Recall that a prime is
a positive integer greater than 1 whose only integer factors are 1 and itself.
Examples
If start is and end is return reason
10 30 6 The primes between 10 and 30 inclusive are 11, 13, 17, 19, 23 and
29
11 29 6 The primes between 11 and 29 inclusive are 11, 13, 17, 19, 23 and
29
20 22 0 20, 21, and 22 are all non-prime
1 1 0 By definition, 1 is not a prime number
5 5 1 5 is a prime number
6 2 0 start must be less than or equal to end
-10 6 3 primes are greater than 1 and 2, 3, 5 are prime

 */
    public static void main(String[] args) {

        System.out.println(primeCount(10, 30));
        System.out.println(primeCount(11, 29));
        System.out.println(primeCount(20, 22));
        System.out.println(primeCount(1, 1));
        System.out.println(primeCount(5, 5));
        System.out.println(primeCount(6, 2));
        System.out.println(primeCount(-10, 6));

    }

    static int primeCount(int start, int end){
        int primeCount = 0;
        for(int number = start; number <= end; number++){
            if(number > 1){
                boolean isPrime = true;
                for(int i = 2; i * 2 <= number; i++){
                    if(number % i == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    primeCount++;
                }
            }
        }
        return primeCount;
    }


}
