import java.util.Scanner;
public class EvenOdd{

public static void main(String srgs[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter number ");
int num = sc.nextInt();


if(num%2==0)
System.out.println("Number is even");
else
System.out.println("Number is odd");
}


}