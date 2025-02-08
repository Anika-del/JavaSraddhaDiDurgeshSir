import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

    /*    if (num > 0) {
            String reversed = "";
            while (num > 0) {
                int digit = num % 10;
                reversed += digit;
                num /= 10;
            }
			System.out.println("reverse order number "+ reversed);
	}
	*/
			int r;
			while(num > 0){
				r = num%10;
				System.out.print(r);
				num = num/10;
			
   
}
}
}