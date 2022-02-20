package com.company;

import java.util.Scanner;

/*
Find the number of positive elements in the given array.
Example` Input` 1 -1 2 3 -8
Output 1 2 3
*/
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input arrays " + (i) + " index element: ");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                System.out.print(arr[i] + " ");
                count++;
            }
        }
        System.out.println("\n" + count);
    }
}
