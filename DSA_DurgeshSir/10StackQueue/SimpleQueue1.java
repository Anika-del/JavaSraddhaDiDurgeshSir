//First code from durgesh sir
public class SimpleQueue1{

    private int[] queue;
    private int front, rear, size;
    // private int rear;
    // private int size;

    public SimpleQueue1(int size){ //constructor
        this.size = size;
        this.queue = new int[size];
        this.front = 0;  //front means delete | 0 pre delete nhi kr sakte
        this.rear = -1; //rear means insert | blank h ab insert kr sakte h 
    }

    //insert data at rear:Endueue
    public void insert(int data){
      if(rear == size-1){    //rear==size-1 means 0 to element size tk full h 
        System.out.println( "Queue is full");
        return;
      }
      rear++;
      queue[rear] = data;  //else queue me rear ke jagah data put kr denge 
      System.out.println(data + " data is inserted");
    }

    //Dequeue remove fron front se krenge 
    public int delete(){ 
        if(front > rear){
            System.out.println(" Queue is empty");
            return -1;
        }
        int data = queue[front];
        front++;
       return data;
    }

    //peak last element nikalna to h but  without delete
    public int peak(){
        if(front>rear){
            System.out.println("queue is empty");
            return -1;
        }
        return queue[front];
    }

    //display
    public void display(){
        if(front>rear){
            System.out.println("queue is empty");
            return;
        }
        //loop lgayenge for display
        for(int i=front; i<=rear; i++){
            System.out.print(queue[i]+"\t");
        }
    }

    public static void main(String[] args){
       
        SimpleQueue1 sq = new SimpleQueue1(5);
        sq.insert(200);
        sq.insert(10);
        sq.insert(30); //last se insert krega
        sq.display();
        System.out.println("Deleted " +sq.delete()); //start ka delete kr dega
        sq.display();
        sq.insert(69);
        sq.insert(44);
        sq.display();
        sq.insert(69); //full bolega capacity 5 h kuki delete aage se huaa h and o jagah abhi bhi empty h  ye circuler me teikle hoga
    }
}