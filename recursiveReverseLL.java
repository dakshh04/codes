class Node{
    int data;
    Node next;
    Node(int x){
        data =x;
        next = null;
    }
}

class Main{
    static Node reverseList(Node head){
        if(head == null || head.next ==null) return head;
        Node rest_head = reverseList(head.next);
        Node rest_tail = head.next;
        rest_tail.next = head;
        head.next = null;
        return rest_head;
    }
    
    static void printList(Node head){
        if(head == null) return;
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
        head.next.next.next = new Node(40);
        printList(head);
        head = reverseList(head);
        printList(head);
    }
}
