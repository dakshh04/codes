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
    
    static Node insertBegin(Node head, int x){
        Node temp = new Node(x);
        temp.next = head;
        if(head != null){
            head.prev = temp;
        }
        return temp;
    }
    
    static Node insertEnd(Node head, int x){
        Node temp = new Node(x);
        Node curr = head;
        if(curr == null) return temp;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return temp;
    }
    
    public static void main(String [] args){
        Node head = new Node(10);
        Node temp1 = new Node(15);
        Node temp2 = new Node(20);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        printList(head);
        // head = insertBegin(head, 5);
        head = insertEnd(head, 25);
        printList(head);
    }
    
    static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
