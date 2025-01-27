import java.util.Scanner;

public class LargetElement {

    // find the largest element in an array
    public static int findLargestElement(int array[]) {
        // access
        int largestElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largestElement)
                largestElement = array[i];
        }
        return largestElement;
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

        // logic to find largest element in array
        int largetValue = findLargestElement(arr);
        System.out.println("largest value is " + largetValue);
    }

}
