package InterviewCompany.PrefectCode2;

public class Swapping {
    
    // public class SwapWithoutTemp {
        public static void main(String[] args) {
            int a = 3;
            int b = 2;
            System.out.println("Before swapping: a = " + a + ", b = " + b);
            // Swap the values
            a = a + b; // a now becomes 5 (3 + 2)
            b = a - b; // b now becomes 3 (5 - 2)
            a = a - b; // a now becomes 2 (5 - 3)
            System.out.println("After swapping: a = " + a + ", b = " + b);
        }
    }
    
