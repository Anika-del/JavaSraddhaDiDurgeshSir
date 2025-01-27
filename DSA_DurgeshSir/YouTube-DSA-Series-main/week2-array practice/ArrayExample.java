class ArrayExample {
    public static void main(String[] args) {

        // create array
        // declare the array + initialize the array
        int marks[] = { 90, 80, 10, 20, 50, 75 };

        // declare the array
        // int failedStudentMarks[];
        // // initialize the array
        int size = 4;
        // failedStudentMarks = new int[size];
        // declare + initialize
        int failedStudentMarks[] = new int[size];

        // access the data

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[4]);
        System.out.println(marks[marks.length - 1]);

        System.out.println(failedStudentMarks[0]);
        System.out.println(failedStudentMarks[1]);

        System.out.println("-----------");
        // print all the data of marks array[array traverse]
        for (int i = 0; i < marks.length; i++) {
            System.out.println("The value at index " + i + " is " + marks[i]);
        }

        marks[0] = 100;

        // enhance/for-each
        for (int value : marks) {
            System.out.println(value);
        }

        // modify the array

    }
}