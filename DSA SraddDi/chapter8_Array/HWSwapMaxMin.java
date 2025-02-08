package chapter8_Array;

import java.util.Scanner;

public class HWSwapMaxMin {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the size of the array:");
            int n = scanner.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            // Find the positions of the minimum and maximum elements
            int minIndex = 0, maxIndex = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }

            // Swap the minimum and maximum elements
            int temp = arr[minIndex];
            arr[minIndex] = arr[maxIndex];
            arr[maxIndex] = temp;

            System.out.println("Array after swapping min and max values:");
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
    }
}
