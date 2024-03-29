public class QueueY{
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int n){
            arr = new int [n];
            this.size = n;
        }

        // isEmpty
        public static boolean isEmpty(){
            return rear == -1;
        }

        // enque
        public static void enque(int data){
            if(rear==size - 1){
                System.out.println("Full");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        // deque
        public static int deque(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }

            int front = arr[0];
            for(int i = 0; i < rear; i++){
                arr[i] = arr[i+1];
            }

            rear--;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println(("Empty"));;
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String [] args){
        Queue q = new Queue(5);
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.enque(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.deque();
        }
    }
}