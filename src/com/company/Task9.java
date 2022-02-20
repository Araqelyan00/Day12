package com.company;

import java.util.Scanner;

/*
Print the elements of the given list in reverse order without changing
the list itself.
Example ` Input ` 1 2 3 4 5
Output ` 5 4 3 2 1
*/
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input arrays " + (i) + " index element: ");
            arr[i] = scanner.nextInt();
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
