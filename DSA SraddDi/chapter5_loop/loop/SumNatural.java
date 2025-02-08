public class SumNatural {
    public static void main(String[] args) {
        int N = 10;
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum = sum+i;
        }

        System.out.println("Sum of first " + N + " Natural Numbers = " + sum);
    }
	
	
	/* public static void main(String[] args) {
        int N = 10;
        int sum = (N * (N + 1)) / 2;

        System.out.println("Sum of first " + N + " Natural Numbers = " + sum);
    } */
}