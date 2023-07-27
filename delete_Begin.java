class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

public class LinkedList{
    Node deleteBegin(Node head, int x){
        if(head.next == null){
            head = null;
            return head;
        }
        head = head.next;
        return head;
    }
    
    void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    
    public static void main(String [] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        LinkedList ll = new LinkedList();
        ll.printList(head);
        head = ll.deleteBegin(head, 10);
        ll.printList(head);
    }
}