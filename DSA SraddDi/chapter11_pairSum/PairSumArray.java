package chapter11_pairSum;

public class PairSumArray {
    
    public static void main(String[] args) {
            int[] numbers = {2, 4, 3, 3};
            int target = 6;
    
            findPairs(numbers, target);
        }
    
        public static void findPairs(int[] numbers, int target) {
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] + numbers[j] == target) {
                        System.out.println("Pair found: " + numbers[i] + ", " + numbers[j]);
                    }
                }
            }
        }
    }
    
