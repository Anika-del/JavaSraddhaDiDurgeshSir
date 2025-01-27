

public class ArrayOperation {
    public static void main(String[] args) {

        ArrayADT array = new ArrayADTImpl(10);

        array.insert(20);
        array.insert(20);
        array.insert(321);

        System.out.println("Array Size : " + array.getSize());

        array.traverse();

        array.update(1, 30);
        array.traverse();
        int searchIndex = array.search(321);
        System.out.println("Search Index of 321 : " + searchIndex);

        array.delete(1);

        System.out.println("Array Size : " + array.getSize());

        array.traverse();

        System.out.println(array.get(1));

    }
}
