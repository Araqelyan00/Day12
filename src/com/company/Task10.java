package com.company;

import java.util.Scanner;

/*
10.Rearrange the elements of this array in reverse order, then print the
elements of the resulting array.
This task differs from the previous one in that you need to change the
values of the elements of the array itself, swapping A [0] with A [n-1], A
[1] with A [n-2], and then display the elements of the array in a row.
Example ` Input ` 1 2 3 4 5
Output ` 5 4 3 2 1
*/
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input arrays " + (i) + " index element: ");
            arr[i] = scanner.nextInt();
        }
        int [] array = new int[n];
        for (int i = n - 1; i >= 0; i --){
            array[i] = arr[i];
            System.out.print(array[i] + " ");
        }
    }
}
