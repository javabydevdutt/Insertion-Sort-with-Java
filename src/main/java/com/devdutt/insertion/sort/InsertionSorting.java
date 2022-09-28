package com.devdutt.insertion.sort;
/*
Time and Space Complexity:-
Best Time complexity:- O(n) :- It occurs when we have a sorted array;
                     as in that case, each element has already been placed at its correct position, and no swap operation will be required.
Worst Time Complexity:- O(n2) :- It occurs when we have a reverse sorted array,
                     as in that case, to find the correct position for any element, we will have to fully traverse the sorted array each time.
*/
import java.util.Arrays;

public class InsertionSorting {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }//while
            arr[j + 1] = temp;
        }//for
        System.out.println("After Sorting:- ");
        System.out.println(Arrays.toString(arr));
    }//method

    public static void main(String[] args) {
        int[] arr = {5, 4, 10, 1, 6, 2};
        System.out.println("Before Sorting :- ");
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
    }//main
}//class
