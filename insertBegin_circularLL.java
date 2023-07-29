class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

class Main{
    static Node insertBegin(Node head, int x){
        Node temp = new Node(x);
        if(head == null){
            temp.next = temp;
            return temp;
        }
        else{
            temp.next = head.next;
            head.next = temp;
            int t = head.data;
            head.data = temp.data;
            temp.data = t;
            return head;
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
        head = insertBegin(head, 5);
        printList(head);
    }
}
