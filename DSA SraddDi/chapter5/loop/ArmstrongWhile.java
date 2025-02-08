import java.util.Scanner;
// 153 = (1*1*1)+(3*3*3)+(5*5*5) = 153

public class ArmstrongWhile{

    public static void main(String[] args) {

        System.out.println("enter armstrong num : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int c = n;
        int rem, arm=0;
        while(n > 0){

            rem = n%10;
            arm = arm+(rem*rem*rem);
            n = n/10;
        }
        System.out.println(arm);
        if(c==arm)
        System.out.println("number is armstrong");
        else
        System.out.println("number is not arm");
    }

}