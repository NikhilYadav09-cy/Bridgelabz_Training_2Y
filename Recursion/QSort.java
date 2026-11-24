package Recursion;

import java.util.Arrays;

public class QSort {

    public static void quickSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int p = partition(arr, l, r);
        quickSort(arr, l, p - 1);
        quickSort(arr, p + 1, r);
    }

    public static int partition(int[] arr, int l, int r) {
        int pivot = arr[l];


        int count = 0;
        for (int i = l + 1; i <= r; i++) {
            if (arr[i] < pivot) {
                count++;
            }
        }


        int pivotIndex = l + count;
        swap(arr, l, pivotIndex);


        int i = l;
        int j = r;
        while (i < pivotIndex && j > pivotIndex) {
            while (i < pivotIndex && arr[i] < pivot) {
                i++;
            }
            while (j > pivotIndex && arr[j] >= pivot) {
                j--;
            }
            if (i < pivotIndex && j > pivotIndex) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {7, 13, 8, 5, 10, 2, 4};

        System.out.println("Before Sorting the Array:");
        System.out.println(Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting the Array:");
        System.out.println(Arrays.toString(arr));
    }
}