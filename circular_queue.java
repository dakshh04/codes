public class circular_queue {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n){
            arr = new int [n];
            this.size = n;
        }

        // isEmpty
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        // isFull
        public static boolean isFull(){
            return (rear+1) % size == front;
        }

        // enque
        public static void enque(int data){
            if(isFull()){
                System.out.println("Full");
                return;
            }

            // first element add
            if(front == -1){
                front = 0;
            }

            rear = (rear + 1) % size;
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
}
