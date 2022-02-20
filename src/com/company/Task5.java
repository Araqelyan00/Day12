package com.company;

import java.util.Scanner;

/*
An array of numbers is given. If it has two adjacent(հարևան)
elements of the same sign, print these numbers. If there are no
adjacent elements of the same character, do not print anything. If there
are several such pairs of neighbors, print the first pair.
Example` Input` -1 2 3 -1 -2
Output` 2 3
*/
public class Task5 {
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
            if((arr[i] > 0 && arr[i + 1] > 0) || (arr[i] < 0 && arr[i + 1] < 0)){
                System.out.println(arr[i] + ", " + arr[i + 1]);
                return;
            }
        }
    }
}
