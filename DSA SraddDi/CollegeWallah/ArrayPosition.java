public class ArrayPosition {
        public static void main(String[] args) {
            int arr[] = {10, 20, 30, 30, 30, 40, 50};
            int firstIndex = -1;
            int lastIndex = -1;
            
            // Loop through the array to find the first and last occurrence of 30
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 50) {
                    if (firstIndex == -1) {
                        firstIndex = i; // First occurrence
                    }
                    lastIndex = i; // Last occurrence (will keep updating)
                }
            }
            
            System.out.println("First occurrence of 30 is at index: " + firstIndex);
            System.out.println("Last occurrence of 30 is at index: " + lastIndex);
        }
    }
    
