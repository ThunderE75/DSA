package Sorting;

import java.util.Scanner;

public class bubble {
    static int moves;
    static int arr[];
    static String header = " ";

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    static void inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int s = sc.nextInt();
        arr = new int[s];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element (" + (i + 1) + "/" + s + "): ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < s + 2; i++) {
            header += "=";
        }

        sc.close();
    }

    static void printArray(int a[]) {
        System.out.print("[ ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("]\n");
    }

    // private static void printHighlightedArray(int[] a, int i1, int i2) {
    //     System.out.print("[ ");
    //     for (int i = 0; i < a.length; i++) {
    //         if (i == i1) {
    //             System.out.print(ANSI_BLUE + a[i] + " " + ANSI_RESET);
    //         } else if (i == i2) {
    //             System.out.print(ANSI_RED + a[i] + " " + ANSI_RESET);
    //         } else
    //             System.out.print(a[i] + " ");
    //     }
    //     System.out.print("]\n");
    // }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        inputArray();
        int temp;
        System.out.print("\tBubble Sorting\nOriginal Array: ");
        printArray(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("> [Pass " + (i + 1) + "]" + header);
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    moves++;
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    // printHighlightedArray(arr, i, j);
                    printArray(arr);
                }
            }
        }
        System.out.print("\nSorted Array: ");
        printArray(arr);
        System.out.print("Sorted in " + moves + " moves.");

    }

}

// static void printHighlightedArray(int a[], String[] args) {
// System.out.print("[ ");
// for (int i = 0; i < a.length; i++) {
// if (a[Integer.parseInt(args[0])] == i) {
// System.out.print(ANSI_BLUE + a[i] + " " + ANSI_RESET);
// } else
// System.out.print(a[i] + " ");
// if (args[1] != null) {
// if (Integer.parseInt(args[1]) == i) {
// System.out.print(ANSI_GREEN + a[i] + " " + ANSI_RESET);
// }
// }
// }
// System.out.print("]\n");
// }