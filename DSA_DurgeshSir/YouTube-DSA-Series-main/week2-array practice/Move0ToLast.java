import java.util.Scanner;

public class Move0ToLast {

    public static void moveZeroToLast(int[] arr) {

        // non zero element kaha ayenge

        int index = 0;//O(1)

        //O(n)
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }

        }

        // zero element kaha ayenge
        //O(n)
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

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

        // move all zeroes to last

        moveZeroToLast(arr);

        // print the array
        for (int value : arr) {
            System.out.print(value + "\t");
        }
        System.out.println();

    }
}
