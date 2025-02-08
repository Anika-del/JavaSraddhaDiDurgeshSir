
    
    package Pratice;

    import java.util.Scanner;
    public class Pattern {
    
        public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
        char ch = 'A';

        // Upper part of the diamond
        for (int i = 1; i <= n; i++) {
            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
        //lower parts
         // Lower part of the diamond
         ch--;
         for (int i = n - 1; i >= 1; i--) {
             ch--;
             for (int j = n; j > i; j--) {
                 System.out.print(" ");
             }
             for (int k = 1; k <= (2 * i - 1); k++) {
                 System.out.print(ch);
             }
             System.out.println();
         }
       }
    }
    
    
