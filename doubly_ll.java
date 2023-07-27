class Node{
    int data;
    Node prev;
    Node next;
    Node(int x){
        data = x;
        prev = null;
        next = null;
    }
}

public class Main{
    public static void main(String [] args){
        Node head = new Node(10);
        Node temp1 = new Node(15);
        Node temp2 = new Node(20);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        printList(head);
    }
    
    static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
