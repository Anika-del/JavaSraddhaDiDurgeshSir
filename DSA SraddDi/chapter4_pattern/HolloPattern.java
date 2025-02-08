import java.util.Scanner;
class HolloPattern{

public static void main(String args[]){

System.out.println("Enter Number: ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int m = sc.nextInt();

//outer loop
for(int i=1; i<=n; i++){
	//inner loop
   for(int j=1; j<=m; j++){
	   //cell (i,j)
	   if(i==1||j==1 || i==n||j==m){
		   System.out.print("*");
	   }else{
   System.out.print(" ");
   }
   }
   System.out.println(" ");
}

}
}
/*
Enter Number:
4
5
*****
*   *
*   *
*****
*/