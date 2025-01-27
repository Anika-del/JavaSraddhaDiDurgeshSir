class ArrayADTImpl implements ArrayADT {

    // array: to store data
    private int[] array;
    // size: size of array
    private int index;
    // capacity: capacity of array
    private int size;

    // Constructor
    public ArrayADTImpl(int size) {
        this.size = size;
        this.array = new int[this.size];
        this.index = 0;
    }

    // insert the data to array
    @Override
    public void insert(int value) {
        // check if array is full
        if (index == this.size) {
            System.out.println("Array is full");
            return;
        }
        array[index] = value;
        index++;
    }

    // delete
    @Override
    public void delete(int deleteIndex) {

        if (deleteIndex < 0 || deleteIndex >= index) {
            System.out.println("Invalid index");
            return;
        }

        for (int i = deleteIndex; i < index - 1; i++) {
            array[i] = array[i + 1];
        }
        index--;

    }
    // search the element and result the index value

    @Override
    public int search(int value) {
        int indexResult = -1;
        for (int i = 0; i < index; i++) {
            if (array[i] == value) {
                indexResult = i;
                break;
            }
        }
        return indexResult;
    }

    // get the data
    @Override
    public int get(int getIndex) {
        if (getIndex < 0 || getIndex >= this.index) {
            System.out.println("Invalid index");
            return -1;
        }
        return array[getIndex];
    }

    // traverse
    @Override
    public void traverse() {
        for (int i = 0; i < this.index; i++) {
            System.out.println(array[i] + "\t");
        }
        System.out.println();
    }

    // public void update
    @Override
    public void update(int updateIndex, int value) {
        if (updateIndex < 0 || updateIndex >= index) {
            System.out.println("Invalid Index");
            return;
        }
        array[updateIndex] = value;
    }

    // get the size
    @Override
    public int getSize() {
        return this.index;
    }

}