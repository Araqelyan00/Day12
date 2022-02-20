package com.company;

import java.util.Arrays;
import java.util.Scanner;

/*
Cycle the elements of the array to the right (A [0] goes to A [1], A [1]
to A [2], ..., the last element goes to A [0]).
Example ` Input ` 1 2 3 4 5
Output ` 5 1 2 3 4
*/
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input arrays " + (i) + " index element: ");
            arr[i] = scanner.nextInt();
        }
        int x = 0;
        int el = arr[0];
        for (int i = 0; i < arr.length - 1; i++){
            x = el;
            el = arr[i + 1];
            arr[i + 1] = x;
        }
        arr[0] = el;
        System.out.println(Arrays.toString(arr));
    }
}
