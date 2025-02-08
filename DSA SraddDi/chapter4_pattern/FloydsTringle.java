class FloydsTringle{


public static void main(String args[]){

int n=5;
int num = 1;
for(int i=1; i<=n; i++){
	
   
   for(int j=1; j<=i; j++){
   System.out.print(num+" ");
   num++;

   }
   System.out.println(" ");
}

}
}
/*
D:\8Assignment\Apni Kaksha java>java FloydsTringle
1
23
456
78910
1112131415
*/