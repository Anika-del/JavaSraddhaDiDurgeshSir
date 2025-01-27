import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int arr[], int target) {

        int low = 0;
        int high = arr.length - 1;
        int i = 1;
        while (low <= high) {
            System.out.println("pass " + i);
            i++;
            // find mid element
            int midIndex = low + (high - low) / 2;

            if (arr[midIndex] == target) {
                return midIndex;
            }

            if (target < arr[midIndex]) {
                high = midIndex - 1;
            }
            if (target > arr[midIndex]) {
                low = midIndex + 1;
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();

        // defining array and initialsing
        int arr[] = new int[size];
        System.out.println("Enter the array value one by one : ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // input target element from user
        System.out.println("Enter the target element: ");
        int target = scanner.nextInt();

        // calling linear search method

        int foundIndex = binarySearch(arr, target);
        if (foundIndex == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + foundIndex);
        }

    }
}
