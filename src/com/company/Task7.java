package com.company;

import java.util.Scanner;

/*
Print the value of the smallest of all positive elements in the list. It is
known that the list contains at least one positive element, and the
absolute value of all elements of the list does not exceed 1000.
Example ` Input ` 5 -4 3 -2 1
Output ` 1
*/
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input arrays " + (i) + " index element: ");
            arr[i] = scanner.nextInt();
        }
        int min = 1000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }




}
