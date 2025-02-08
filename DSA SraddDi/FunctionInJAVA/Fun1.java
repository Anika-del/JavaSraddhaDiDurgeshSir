package FunctionInJAVA;
//Calling A method must be declared within a class. Here’s a simple method that prints a message:
public class Fun1 {
    
        // This is a method
        static void myMethod() {
            System.out.println("Hello, World!");
        }
    
        public static void main(String[] args) {
            // Calling the method
            myMethod();
        }
    }
    /*
     *Key Points:
static:-
 This keyword means the method belongs to the class itself, not to instances of the class.
void:-
 This indicates that the method does not return any value.
myMethod():-
 This is the name of the method followed by parentheses. If the method takes parameters, they would be listed inside these parentheses.
     */
    
