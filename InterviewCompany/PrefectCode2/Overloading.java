package InterviewCompany.PrefectCode2;
    //mathoperation
    class Overloading {
        // Method to add two integers
        static int add(int a, int b) {
            return a + b;
        }
    
        // Method to add three integers
        static int add(int a, int b, int c) {
            return a + b + c;
        }
    
        // Method to add two double values
        static double add(double a, double b) {
            return a + b;
        }
        public static void main(String[] args) {
            System.out.println(add(2, 3));        // Outputs: 5
            System.out.println(add(2, 3, 4));     // Outputs: 9
            System.out.println(add(2.5, 3.5));    // Outputs: 6.0
        }
    }
    
