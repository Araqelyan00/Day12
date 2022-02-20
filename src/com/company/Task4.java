package com.company;

import java.util.Scanner;

/*
A list of numbers is given. Print all the elements of the list that are
        larger than the previous element.
        Example` Input ` 1 5 2 4 3 Output` 5 4
*/
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input arrays " + (i) + " index element: ");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                System.out.print(arr[i] + " ");
        }
    }
}
