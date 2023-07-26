class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ll_recursive_traverse{
    public static void printList(Node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.data);
        printList(head.next);
    }
    // public Node addNode(Node head){
    //     if(head == null)
    //      = new Node(2,head);
    //     return head;
    // }
    public static void main(String[] args) {
        // Node head = new Node(1, new Node(2, new Node(3)));
        // Node head = new  Node(1,null);
        // head = addNode(head);
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        printList(head);
    }
}
