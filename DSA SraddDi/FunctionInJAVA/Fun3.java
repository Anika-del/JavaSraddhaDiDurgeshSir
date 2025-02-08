/*
Methods with Return Values:-
Methods can return values using the return keyword:
*/
package FunctionInJAVA;

public class Fun3 {
    
        static int add(int a, int b) {
            return a + b;
        }
    
        public static void main(String[] args) {
            int sum = add(5, 3); // sum will be 8
            System.out.println("Sum : " + sum);
        }
    }
    
