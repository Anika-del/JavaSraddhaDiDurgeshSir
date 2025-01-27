
interface ArrayADT {

    // insert the data to array
    void insert(int value);

    // delete
    void delete(int deleteIndex);
    // search the element and result the index value

    int search(int value);

    // get the data
    int get(int getIndex);

    // traverse
    void traverse();

    // public void update
    void update(int updateIndex, int value);

    // get the size
    int getSize();

}