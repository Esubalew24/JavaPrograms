package com.esubalew;

public class Main {

    public static void main(String[] args) {


        System.out.println(arraySum(new int[] {1,3,4,5,6}));
        System.out.println(arraySum(new int[] {1,0,0,0,0}));

        System.out.println(arrayAverage(new int[] {3,4,5}));

        System.out.println(containValue(new int[] {2,4,6}, 1));

        indexValue(new int[] {3,5,7,9}, 9);

        System.out.println("--------------------");

        System.out.println(commonElement(new int[] {3,1,7,9}, new int[] {2,7,4,5}));
        System.out.println(commonElement(new int[] {30,10,13,99}, new int[] {20,77,13,5}));
        System.out.println(commonElement(new int[] {30,44,27,9}, new int[] {22,73,44,56}));

        System.out.println("--------------------");

        printLetters();

        System.out.println("--------------------");


        System.out.println(largestNumber(new int[] {3, 5, 9,10}));
        System.out.println(largestNumber(new int[] {-3, -5, -9,-10}));
        System.out.println(largestNumber(new int[] {0}));

        System.out.println("--------------------");

        System.out.println(smallestNumber(new int[] {3, 5, 9,10}));
        System.out.println(smallestNumber(new int[] {-3, -5, -9,-10}));
        System.out.println(smallestNumber(new int[] {0}));

        System.out.println(secondMax(new int[] {3,6,7,1,9}));
        System.out.println(secondMax(new int[] {39,6,70,10,9}));
        System.out.println(secondMax(new int[] {-3,0,7,91,89}));


        System.out.println(pairElements(new int[] {3, 0, 5, 1, 7, 4 ,4, 8 , 9 ,-1}, 8));

        System.out.println(checkEquality(new int[]{1,3,5}, new int[] {1,3,5}));

        System.out.println(numberOfEvenOdd(new int[] {3,6,4,7,1}));

        System.out.println(largestSmallestDifference(new int[] {3,6,4,7,10}));

        System.out.println("-------------");

        // System.out.println(addOneIntToArray(new int[] {3,7,6, 8, 9}, 1));

        System.out.println(numberToArray(345));


    }

    // Write a Java program to sort a numeric array

    // Write a Java program to sum values of an array

    public static int arraySum(int[] a){
        int sum =0;
        for(int i=0; i<a.length; i++){
           sum += a[i];
        }

        return sum;
    }

    // Write a Java program to calculate the average value of array elements

    public static int arrayAverage(int[] a){
        int sum =0;
        for(int i=0; i<a.length; i++){
            sum += a[i];
        }

        return sum/a.length;
    }

    // Write a Java program to test if an array contains a specific value

    public static int containValue(int[] a, int value){
        for(int i =0; i<a.length; i++){

            if( a[i] == value){
                return 1;
            }
        }
        return 0;
    }


    // Write a Java program to find the index of an array element

    public static void indexValue(int[] a, int value){

        for(int i=0; i<a.length; i++){
            if(a[i] == value){
                System.out.println(i);
            }
        }
    }

    // Write a Java program to find the maximum and minimum value of an array


    // Write a Java program to find the common elements between two arrays

    public static int commonElement(int[] a, int[] b){
        int common = 0;
        for(int i=0; i<a.length; i++){

            for(int j=0; j<b.length; j++){
                if(a[i]==b[j]){
                    common = a[i];
                }
            }
        }
        return common;
    }

    // This program print alphabets on screen i.e a, b, c, ..., z. Here we print alphabets in lower case.

    public static void printLetters(){
        for( char ch = 'a'; ch < 'z'; ch++){
            System.out.println(ch);
        }
    }

    // Maximum Number in an array

    public static int largestNumber(int[] a){
        int maxNum = a[0];
        for(int i=0; i<a.length; i++){

            if( a[i] > maxNum){
                    maxNum = a[i];
                }
            }
        return maxNum;
    }

    // Minimum Number in an array

    public static int smallestNumber(int[] a){
        int minNum = a[0];
        for(int i=0; i<a.length; i++){

            if( a[i] < minNum){
                minNum = a[i];
            }
        }
        return minNum;
    }

    // Second Maximum Number   {3, 6, 5, 7,9}

    public static int secondMax(int[] a){
        int max = a[0];
        int secondMax = a[0];

        for(int i=0; i<a.length; i++) {
            if (a[i] > max) {
                secondMax = max;
                max = a[i];
            }
            else if (a[i] > secondMax) {
                secondMax = a[i];
            }
        }
        return secondMax;
    }

    // Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number

    public static int pairElements(int[] a, int value){
        int count=0;
        for(int i=0; i<a.length; i++){
            for(int j= i+1; j<a.length; j++){
                if(a[i] + a[j] == value){
                    count++;
                }
            }
        }
        return count;
    }

   //  Write a Java program to test the equality of two arrays.

    public static int checkEquality(int[] a, int[] b){
        if(a.length != b.length){
            return 0;
        }
        for(int i=0; i<a.length; i++){

                if(a[i] != b[i]){
                return 0;

            }
        }
        return 1;
    }

     // Write a Java program to move all 0's to the end of an array.
    // Maintain the relative order of the other (non-zero) array elements


    //  Write a Java program to find the number of even and odd integers in a given array of integers

    public static int numberOfEvenOdd(int[] a){
        int numberOfEven = 0;
        int numberOfOdd = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]%2 ==0){
                numberOfEven ++;
                numberOfOdd = a.length -numberOfEven;
            }

        }
        return numberOfEven;
    }


    // Write a Java program to get the difference between the
    // largest and smallest values in an array of integers

    public static int largestSmallestDifference(int[] a){

        int largest = a[0];
        int smallest = a[0];
        for(int i=0; i<a.length; i++){

            if(a[i] > largest ){
                largest = a[i];
            }
            else if( a[i] < smallest) {
                smallest = a[i];
            }
        }
        return largest - smallest;
    }

    // Change digits of a number into array



    // Write a Java program to insert an element (specific position) into an array.



}
