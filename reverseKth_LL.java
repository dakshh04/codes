class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

class Main{
    static Node reverseKth(Node head, int k){
        if(head == null || head.next == null){
            return head;
        }
        Node next = null;
        Node curr = head;
        Node prev = null;
        int count = 0;
        while(curr != null && count < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        
        if(next != null){
            Node restHead = reverseKth(next, k);
            head.next = restHead;
        }
        return prev;
    }
    
    static void printList(Node head){
        if(head == null || head.next == null) return;
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
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
        head.next.next.next.next.next.next.next = new Node(80);
        printList(head);
        head = reverseKth(head, 3);
        printList(head);
    }
}
