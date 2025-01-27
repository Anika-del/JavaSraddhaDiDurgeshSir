import java.util.Scanner;

public class LinearSearch {

    // linear search
    public static int linearSeach(int array[], int target) {

        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                index = i;
                break;
            }
        }

        return index;

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

        int foundIndex = linearSeach(arr, target);
        if (foundIndex == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + foundIndex);
        }

    }

}
