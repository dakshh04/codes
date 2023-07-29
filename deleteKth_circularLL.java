class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

class Main{
    static Node deleteHead(Node head){
        if(head == null || head.next == null) return null;
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }
    
    static Node deleteK(Node head, int k){
        if(head == null) return null;
        if(k == 1){
            return deleteHead(head);
        }
        Node curr = head;
        for(int i = 0; i < k - 2; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
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
        head = deleteK(head, 2);
        printList(head);
    }
}
