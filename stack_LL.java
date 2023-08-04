class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

class my_Stack{
    Node head;
    int sz;
    my_Stack(){
        head = null;
        sz = 0;
    }

    void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        sz++;
    }

    int pop(){
        if(head==null) return Integer.MAX_VALUE;
        int res = head.data;
        Node temp = head;
        head = head.next;
        sz--;
        return res;
    }

    int peek(){
        if(head==null) return Integer.MAX_VALUE;
        return head.data;
    }

    int size(){
        return sz;
    }

    boolean isEmpty(){
        return head==null;
    }
}

public class stack_LL {
    public static void main(String [] args){
        my_Stack s = new my_Stack();
        s.push(10);
        s.push(15);
        s.push(25);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
}
