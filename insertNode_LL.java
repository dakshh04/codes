class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

class Main{
    static Node insert(Node head, int x){
        Node temp = new Node(x);
        if(head == null){
            return temp;
        }
        if(x < head.data){
            temp.next = head;
            return temp;
        }
        Node curr = head;
        while(curr.next != null && curr.next.data < x){
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }
    
    static void printList(Node head){
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
        printList(head);
        head = insert(head, 35);
        printList(head);
    }
}
