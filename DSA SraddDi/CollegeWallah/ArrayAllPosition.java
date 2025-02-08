public class ArrayAllPosition {
    
     public static void main(String[] args) {
            int arr[] = {10, 20, 30, 30, 30, 30, 50};
            
            System.out.print("Positions of 30 in the array: ");
            
            // Loop through the array to find all occurrences of 30
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 30) {
                    System.out.print(i + " ");
                }
            }
        }
    }
    
