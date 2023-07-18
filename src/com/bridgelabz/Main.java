package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Array Practice Problems ***");
        //1. Print Elements of an Array
        System.out.println("Elements of an Array:-");
        String[] array = {"Drisya","Varsha","Deepa"};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println();
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
        System.out.println();
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
        System.out.println();
        //4.print the Smallest element in an array
        System.out.println("Smallest Element in an array :-");

        int[] array4 = {20,8,12,15,9,10};
        System.out.println("Array = "+Arrays.toString(array4));
        int smallestElement =  array4[0];    //Considering zeroth element is smallest element

        for (int i=1; i<array4.length; i++) {
            if (array4[i] < smallestElement) {
                smallestElement = array4[i];
            }
        }
        System.out.println("The Smallest element in an Array is "+smallestElement);
        System.out.println();
        //5.Print the elements of an array present on an even position
        System.out.println("Elements of an Array present in an Even Position :-");

        int[] array5 = {10,11,12,13,14,15,16,17,18,19,20};
        for (int i=0; i<array5.length; i=i+2) {
            System.out.println("Index = " +i+"," + "Value =" +array5[i]);
        }
        System.out.println();
        //6.Print the elements of an array in reverse order
        System.out.println("Elements of an Array in Reverse Order :-");

        int[]array6 = {25,35,15,95,75,55};

        System.out.println("Array = "+Arrays.toString(array6));
        System.out.println("Reverse Array :- ");
        for (int i=array6.length-1; i>=0; i--) {
            System.out.println(array6[i]);
        }
        System.out.println();
        //7.Print the elements of an array present on an even position
        System.out.println("Elements of an Array present in an Odd Position :-");

        int[] array7 = {10,11,12,13,14,15,16,17,18,19,20};
        for (int i=1; i<array7.length; i=i+2) {
            System.out.println("Index = " +i+"," + "Value =" +array7[i]);
        }
        System.out.println();
        //8.Print the duplicate elements of an array
        System.out.println("Duplicate elements of an array :-");

        int[] arr = {15, 25, 35, 60, 40, 35, 40};
        System.out.println("Array = "+ Arrays.toString(arr));

        System.out.println("Duplicate elements in an array ");
        for(int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if  (arr[i] == arr[j]){
                    System.out.println("Duplicate of Elements in array is  " + arr[j]);
                }
            }
        }
        System.out.println();
        //9.Sort the elements of an array in ascending order
        System.out.println("Sort the elements of an array in ascending order :-");

        int[] array9 = {10, 8, 6, 12, 9, 3};
        int temp = 0;

        System.out.println("Elements of original array ");
        for (int i = 0; i < array9.length; i++) {
            System.out.print(array9[i] + " ");
        }

        for (int i = 0; i < array9.length; i++) {
            for (int j = i + 1; j < array9.length; j++) {
                if (array9[i] > array9[j]) {
                    temp = array9[i];
                    array9[i] = array9[j];
                    array9[j] = temp;
                }
            }
        }
        System.out.println();

        System.out.println("Displaying Elements in Ascending order");
        for (int i = 0; i < array9.length; i++){
            System.out.print(array9[i] + " ");
        }
        System.out.println();
        System.out.println();
        //10.2nd Largest Number in an Array
        System.out.println("Second Largest Element in an Array :-");

        int[] array10 = new int[6];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Elements of array : ");

        for (int i=0; i<6; i++) {
            array10[i] = scanner.nextInt();
        }
        System.out.println("Array Elements :");
        for (int i=0; i<6; i++) {
            System.out.println(array10[i]);
        }

        int maximum = array10[0];
        int secondLargest = array10[0];
        for (int i=0; i<array10.length; i++) {
            if (maximum < array10[i]) {
                secondLargest = maximum;
                maximum = array10[i];
            }
            if (array10[i] < maximum && array10[i] > secondLargest) {
                secondLargest = array10[i];
            }
        }

        //System.out.println("Largest Number In Array : "+maximum);
        System.out.println("Second Largest Number in Array : "+secondLargest);

    }
}