public class Complex {

    static void linearTime() {
        int array[] = {
                1, 2, 3, 4, 45, 35, 464, 67, 4, 3
        };
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + " time \t");
            System.out.println(array[i] + " ");

        } // O(n)
    }

    static void constantTime() {
        int array[] = {
                1, 2, 3, 4, 45, 35, 464, 67
        };

        System.out.println(array[0]);// O(1)

    }

    public static void main(String[] args) {
        // constantTime();
        linearTime();

    }
}
