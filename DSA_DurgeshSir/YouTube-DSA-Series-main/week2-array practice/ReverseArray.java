import java.util.Scanner;

public class ReverseArray {

    public static int[] reverseArray(int array[]) {

        // for (int i = 0; i < array.length / 2; i++) {
        // int temp = array[i];
        // array[i] = array[array.length - i - 1];
        // array[array.length - i - 1] = temp;
        // }
        int temp[] = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            temp[temp.length - i - 1] = array[i];
        }
        return temp;

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

        // logic
        int rev[] = reverseArray(arr);

        for (int value : rev) {
            System.out.print(value + " \t ");
        }
    }
}
