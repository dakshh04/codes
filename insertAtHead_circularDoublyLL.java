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

class Main{
    static Node insertAtHead(Node head, int x){
        Node temp = new Node(x);
        if(head == null){
            temp.next = temp;;
            temp.prev = temp;
            return temp;
        }
        temp.prev = head.prev;
        temp.next = head;
        head.prev.next = temp;
        head.prev = temp;
        return temp;
    }
    
    static void printList(Node head){
        if(head==null)return;
        Node curr = head;
        do{
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        while(curr != head);
    }
    
    public static void main(String [] args){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = head;
        head.prev = temp2;
        temp1.prev = head;
        temp2.prev = temp1;
        head = insertAtHead(head, 5);
        printList(head);
    }
}
