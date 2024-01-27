package Sorting;

import java.util.Scanner;

public class quick {
    static int[] arr;
    static int size;
    int partition(int a[], int start, int end) {
        int pivot = a[end];
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++) {
            if (a[j] < pivot) {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i + 1];
        a[i + 1] = a[end];
        a[end] = t;
        return (i + 1);
    }

    void sort(int a[], int start, int end){
        if (start < end) {
            int p = partition(a, start, end);
            sort(a, start, p - 1);
            sort(a, p + 1, end);
        }
    }
    
    void inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number [" + (i + 1) + "/" + size + "]: ");
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    static void printArray(String msg, int a[]) {
        System.out.print("> " + msg + ": [ ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        quick qs = new quick();
        qs.inputArray();
        printArray("Original Array", arr);
        qs.sort(arr, 0, arr.length - 1);
        printArray("After Heap Sort", arr);
    }
}