package com.company;

import java.util.Scanner;

/*
Print all elements of the array with even indices (that is, A [0], A
[2], A [4]...)
- Input natural integer N
- define an array with size N,
- Initialize it
Example ` Input` 1 2 3 4 5
Output` 1 3 5
*/
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input arrays " + (i) + " index element: ");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
