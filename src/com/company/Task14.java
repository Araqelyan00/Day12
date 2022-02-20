package com.company;

import java.util.Scanner;

/*
You are given an array of numbers and the index of an element in the
array. Index is k. Remove the element with index k from the list by
moving all elements to the right of the element with index k to the left.
The program should shift directly in the array, and not do it when
displaying elements. Also, you cannot use an additional array.
At least decrement size of array, and print array;
*/
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input arrays " + (i) + " index element: ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Input k: ");
        int k = scanner.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            if (i >= k) {
                arr[i] = arr[i + 1];
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
