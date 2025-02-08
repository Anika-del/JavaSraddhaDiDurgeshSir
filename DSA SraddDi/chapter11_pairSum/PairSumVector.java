package chapter11_pairSum;

import java.util.Vector;

public class PairSumVector {

           public static void main(String[] args) {
            Vector<Integer> numbers = new Vector<>();
            numbers.add(2);
            numbers.add(4);
            numbers.add(3);
            numbers.add(3);
            int target = 6;
    
            findPairs(numbers, target);
        }
    
        public static void findPairs(Vector<Integer> numbers, int target) {
            for (int i = 0; i < numbers.size(); i++) {
                for (int j = i + 1; j < numbers.size(); j++) {
                    if (numbers.get(i) + numbers.get(j) == target) {
                        System.out.println("Pair found: " + numbers.get(i) + ", " + numbers.get(j));
                    }
                }
            }
        }
    }
    