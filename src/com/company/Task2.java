package com.company;

import java.util.Scanner;

/*
Print all even numbered items in the list.
- Input natural integer N
- define an array with size N,
- Initialize it
Example ` Input` 1 2 3 4 5 10
Output` 2 4 10
*/
public class Task2 {
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
                if (arr[i] % 2 == 0) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
