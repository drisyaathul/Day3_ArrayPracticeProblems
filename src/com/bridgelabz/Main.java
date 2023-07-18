package com.bridgelabz;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Array Practice Problems ***");
        //1. Print Elements of an Array
        System.out.println("Elements of an Array:-");
        String[] array = {"Drisya","Varsha","Deepa"};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        //2.find the frequency of each element in the array
        System.out.println("Frequency of each element in the array :-");

        int[] array2 = new int[]{2,5,8,9,5,8,8,6,2};
        int[] visitedArray = new int[array2.length];

        int visited = -1;

        for (int i=0; i<array2.length; i++) {
            int count = 1;
            for (int j=i+1; j<array2.length; j++) {
                if (array2[i] == array2[j]) {
                    count++;
                    visitedArray[j] = visited;
                }
            }
            if (visitedArray[i] != visited) {
                visitedArray[i] = count;
            }
        }
        for (int i=0; i<visitedArray.length; i++) {
            if (visitedArray[i] != visited) {
                System.out.println("Frequency of "+array2[i]+" : "+visitedArray[i]);
            }
        }
        //3.print the largest element in an array
        System.out.println("Largest Element in an array :-");

        int[] array3 = {5,8,12,15,9,10};
        System.out.println("Array = "+Arrays.toString(array3));
        int largestElement =  array3[0];    //Considering zeroth element is largest element

        for (int i=1; i<array3.length; i++) {
            if (array3[i] > largestElement) {
                largestElement = array3[i];
            }
        }
        System.out.println("The Largest Element in an Array is "+largestElement);
        //4.print the Smallest element in an array
        System.out.println("Smallest Element in an array :-");

        int[] array4 = {20,8,12,15,9,10};
        System.out.println("Array = "+Arrays.toString(array4));
        int smallestElement =  array4[0];    //Considering zeroth element is largest element

        for (int i=1; i<array4.length; i++) {
            if (array4[i] < smallestElement) {
                smallestElement = array4[i];
            }
        }
        System.out.println("The Smallest element in an Array is "+smallestElement);
    }
}