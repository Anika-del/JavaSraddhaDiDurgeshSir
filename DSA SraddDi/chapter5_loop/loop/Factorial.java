class Factorial {

    public static void main(String[] args) {
        
        System.out.println("Enter no. ");
        int num = new java.util.Scanner(System.in).nextInt();
            int fact = 1;
        for(int i=1; i<=num; i++){
            fact = fact*i;
        
        }
        System.out.println("Factorial of numebr is "+num+" 0f "+ fact);
    }
    
}
