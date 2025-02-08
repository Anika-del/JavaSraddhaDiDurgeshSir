import java.util.Scanner;

public class Sumdivthree {

    public static void main(String[] args) {
        
        System.out.println("enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum=0, div=1;
        for(int i=1; i<=n; i++){
            if(n/3==0)
            div = i+sum;
        }
        System.out.println("sum of 3 divide number is" +div);
    }
    
}
