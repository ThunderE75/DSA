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
                printArray(moves, a, temp, a[j], key);
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

    static void printArray(String msg, int a[], int i1, int i2) {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_PURPLE = "\u001B[35m";
        String ANSI_WHITE = "\u001B[37m";
        // String ANSI_YELLOW = "\u001B[33m";
        // String ANSI_BLACK = "\u001B[30m";
        // String ANSI_CYAN = "\u001B[36m";
        String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        // String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        // String ANSI_RED_BACKGROUND = "\u001B[41m";
        // String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        // String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
        // String ANSI_BLUE_BACKGROUND = "\u001B[44m";
        // String ANSI_WHITE_BACKGROUND = "\u001B[47m";
        // String ANSI_CYAN_BACKGROUND = "\u001B[46m";

        System.out.print(msg + ":\t[ ");
        for (int i = 0; i < a.length; i++) {
            if (i == i1) {
                System.out.print(ANSI_RED + a[i] + ANSI_RESET + " ");
            } else if (i == i2) {
                System.out.print(ANSI_BLUE + a[i] + ANSI_RESET + " ");
            } else
                System.out.print(a[i] + " ");
        }
        System.out.print("]\n");
    }

    static void printArray(String msg, int a[], int i1, int i2, int i3) {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_GREEN = "\u001B[32m";
        // String ANSI_PURPLE = "\u001B[35m";
        // String ANSI_WHITE = "\u001B[37m";

        System.out.print(msg + ":\t[ ");
        for (int i = 0; i < a.length; i++) {
            if (i == i1) {
                System.out.print(ANSI_RED + a[i] + ANSI_RESET + " ");
            } else if (i == i2) {
                System.out.print(ANSI_BLUE + a[i] + ANSI_RESET + " ");
            } else if (i == i3) {
                System.out.print(ANSI_GREEN + a[i] + ANSI_RESET + " ");
            } else
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
