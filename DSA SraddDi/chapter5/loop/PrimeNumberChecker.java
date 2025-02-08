import java.util.Scanner;

//jo khud and 1 se divide ho it is prime number
public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
		
int count=0;
for(int i=1; i<=num; i++){
	if(num%i==0){
		count++;
	}
}

        if (count==2) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
/*
    // Function to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // n is divisible by i, so it's not prime
            }
        }
        return true; // n is prime
	}*/
    
}
