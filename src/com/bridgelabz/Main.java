package com.bridgelabz;

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
    }
}