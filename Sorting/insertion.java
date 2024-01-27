package Sorting;

import java.util.Scanner;

public class insertion {
    static int[] arr;

    static void sort(int[] a) {
        int j, key;
        String moves = "moves ";
        for (int i = 0; i < a.length; i++) {
            key = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > key) {
                int temp = j++;
                a[temp] = a[j];
                j--;
                moves += j;
                printArray(moves, a);
            }
            a[j + 1] = key;
            moves = "moves ";
        }
    }

    static void inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("# Enter the size: ");
        int s = sc.nextInt();
        arr = new int[s];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  Enter element (" + (i + 1) + "/" + s + "): ");
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    static void printArray(String msg, int a[]) {
        System.out.print(msg + ":\t[ ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        inputArray();
        printArray("> Original", arr);
        sort(arr);
        printArray("> Sorted", arr);

    }
}
