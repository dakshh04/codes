class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

class Main{
    static void printNth(Node head, int x){
        if(head == null){
            return;
        }
        Node first = head;
        for(int i = 0; i < x; i++){
            first = first.next;
        }
        Node second = head;
        while(first != null){
            first = first.next;
            second = second.next;
        }
        System.out.println(second.data);
    }

    // second method
    // static void printNth(Node head, int x){
    //     int len = 0;
    //     for(Node curr = head; curr != null; curr = curr.next){
    //         len++;
    //     }
    //     if(len < x){
    //         return;
    //     }
    //     Node curr = head;
    //     for(int i = 1; i < len-x+1; i++){
    //         curr = curr.next;
    //     }
    //     System.out.println(curr.data);
    // }
    
    static void printList(Node head){
        if(head == null) return;
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    
    public static void main(String [] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printNth(head, 2);
    }
}