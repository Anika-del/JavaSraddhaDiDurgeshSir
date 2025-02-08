   
    import java.util.Scanner;

    public class ternary {
        public static void main(String[] args) {
            System.out.println("Enter a number: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
    
            String arg = num%2 == 0 ? "even" : "odd";
            System.out.println(arg);
        
        }
    }
    
