
class VariableDataTypeEx {

    public static void printMessage(String message) {
        System.out.println(message);
    }

    // starting point of our class
    public static void main(String arr[]) {
        // actual apna code
        // console print
        System.out.println("DSA Tutorial Yt 🔥");

        // console print
        System.out.println("Learn From A to Z");
        // console print
        printMessage("Hello. Whats going on in this series ?");

        int x = 50;
        System.out.println("value of x " + x);
        x = 80;
        System.out.println("value of x " + x);

        // int y=56.8;
        // 9089.wet5
        // arun
        // true
        // false

        double marks = 98.56;
        System.out.println("marks " + marks);

        float f = 6.78F;

        System.out.println("Value of float f " + f);

        char ch = 'a';
        System.out.println("value of char ch " + ch);
        char ch1 = 'A';
        System.out.println("value of char ch1 " + ch1);

        boolean isActive = true;
        System.out.println("isActive " + isActive);
        boolean isProductLive = false;
        System.out.println("isProductLive " + isProductLive);

        // using no primitive data types

        Student s1 = new Student();
        s1.name = "Arun";
        s1.phone = "25235235";
        s1.rollNumber = 255215L;
        s1.city = "Delhi";

        Student s2 = new Student();

        s2.name = "Akash";
        s2.phone = "9876543210";
        s2.rollNumber = 255215L;
        s2.city = "Mumbai";

        System.out.println("1st Student name is " + s1.name);
        System.out.println("1st Student rollNumber is " + s1.rollNumber);
        System.out.println("2nd Student name is " + s2.name);
        System.out.println("2nd Student rollNumber is " + s2.rollNumber);

    }
}