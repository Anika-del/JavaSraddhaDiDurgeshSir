package chapter8_Array;

import java.util.Scanner;

public class ProductofAllElement {
    
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int n = scanner.nextInt();
            int[] arr = new int[n];
    
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
    
            long product = 1; // Use long to handle large products
            for (int i = 0; i < n; i++) {
                product *= arr[i];
            }
    
            System.out.println("Product of all elements in the array: " + product);
        }
    }
    
