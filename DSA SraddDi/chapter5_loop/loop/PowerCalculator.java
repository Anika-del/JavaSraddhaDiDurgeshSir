import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
		
		int result=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();
		
		for(int i=1; i<=power; i++){
			
			result = result*num;
		}
		System.out.println(num+ " power "+power+" is "+ result);
		

        
    }
}
