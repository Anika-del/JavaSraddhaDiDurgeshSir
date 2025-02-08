public class LogicalAnd {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        if (a < b && b < c) {
            System.out.println("Both conditions are true.");
        } else {
            System.out.println("At least one condition is false.");
        }
    }
}
