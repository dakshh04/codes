class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

public class deleteNode_pointer {
    static void deleteNode(Node num){
        num.data = num.next.data;
        num.next = num.next.next;
    }

    static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String [] args){
        Node head = new Node(10);
        Node ptr = new Node(40);
        head.next = ptr;
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        printList(head);
        deleteNode(ptr);
        printList(head);
    }
}
