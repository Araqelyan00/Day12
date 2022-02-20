package com.company;

import java.util.Scanner;

/*
Rearrange the adjacent elements of the array (A [0] with A [1], A [2]
with A [3], etc.). If there is an odd number of elements, then the last
element remains in its place.
Example ` Input ` 1 2 3 4 5
Output ` 2 1 4 3 5
*/
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input arrays " + (i) + " index element: ");
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 1; i < arr.length; i++){

            if (arr[i] % 2 == 1){
                arr[i] = arr[i];
            }else{
                count = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = count;
            }

            System.out.print(arr[i - 1] + " ");
        }
        System.out.print(arr[n-1]);
    }
}
