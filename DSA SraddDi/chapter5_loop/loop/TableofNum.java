import java.util.Scanner;

public class TableofNum{

public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number : ");
	int num = sc.nextInt();
	
	int mul = 0;
	for(int i=1; i<=10; i++){
		
		mul = num*i;
		
		 System.out.println(num + " x " + i + " = " + mul);
	}
	
}
}