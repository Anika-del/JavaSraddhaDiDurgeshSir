import java.util.Scanner;

public class CheckSorted {

    public static boolean checkSorted(int array[]) {
        // assume array is sorted : true
        boolean isSorted = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < array[i])
                isSorted = false;

        }
        return isSorted;
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

        // checking if the array is sorted or not
        boolean checkResult = checkSorted(arr);
        System.out.println("The array is " + (checkResult ? "" : "not ") + "sorted");
    }
}
