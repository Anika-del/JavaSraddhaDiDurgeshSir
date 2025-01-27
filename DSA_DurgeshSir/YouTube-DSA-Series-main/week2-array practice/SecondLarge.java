import java.util.Scanner;

public class SecondLarge {

    public static int findSecondLargestNumber(int array[]) {
        // assumption
        int largest = array[0];
        int secondLargest = array[1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                // this line must of before
                secondLargest = largest;
                // this line
                largest = array[i];

            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }

        return secondLargest;

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

        // find the second largest number

        int secondLargestNumber = findSecondLargestNumber(arr);
        System.out.println("Second Largest Value " + secondLargestNumber);

    }
}
