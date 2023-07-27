class Node{
    int data;
    Node next;
    Node(int x){
        data =x;
        next = null;
    }
}

public class Main{
    static int search(Node head, int x){
        int pos = 1;
        Node curr = head;
        while(curr != null){
            if(curr.data == x){
                return pos;
            }
            else{
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }
    
    public static void main(String [] args){
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(20);
        head.next.next.next = new Node(25);
        System.out.println(search(head, 20));
    }
}