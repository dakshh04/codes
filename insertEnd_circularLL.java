class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

class Main{
    static Node insertEnd(Node head, int x){
        Node temp = new Node(x);
        if(head == null){
            temp.next = temp;
            return temp;
        }
        else{
            temp.next = head.next;
            head.next = temp;
            int t = temp.data;
            temp.data = head.data;
            head.data = t;
            return temp;
        }
    }
    
    static void printList(Node head){
        Node curr = head;
        do{
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        while(curr != head);
        System.out.println();
    }
    
    public static void main(String [] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        printList(head);
        head = insertEnd(head, 40);
        printList(head);
    }
}
