////First code from sraddha ma'am
// add o(1), peak o(n), remove o(n)
public class SimpleQue1 {

    static int[] arr;
    static int size;
    static int front = -1;
    static int rear;

    SimpleQue1(int n){
        arr = new int[n];
        this.size = n;
    }
    public static boolean isEmpty(){
        return rear == -1;
    }
    //endqueue
    public static void add(int data){
        if(rear == size-1){
            System.out.println("queue is full");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    //dqueue
    public static int remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int front = arr[0];
        for(int i=0; i<rear; i++){
            arr[i] = arr[i+1];
        }
        rear--;
            return front;
    }

    //peek
    public static int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
            return arr[0];
    }

    public static void main(String[] args) {
        SimpleQue1 sq = new SimpleQue1( 5);
        sq.add(30);
        sq.add(40);
        sq.add(50);
        //1,2,3
        while(!sq.isEmpty()){
            System.out.println(sq.peek());
            sq.remove();
        }
    }
    
}
