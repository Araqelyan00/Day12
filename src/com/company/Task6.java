package com.company;

import java.util.Scanner;

/*
An array of numbers is given. Print the value of the largest element in
the array, and then the index of that element in the array. If there are
several largest elements, print the index of the first of them.
Example` Input` 1 2 3 2 1
Output` The largest is 3 index is 2
*/
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input arrays " + (i) + " index element: ");
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        int index = 0;
         for(int i = 1; i < arr.length; i++){
             if (arr[i] > max){
                 max = arr[i];
                 index = i;
             }
         }
         System.out.println("The largest is " + max + " index is " + index);
    }
}