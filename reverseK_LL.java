class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

public class reverseK_LL {
    static Node reverseKth(Node head, int k){
        Node curr = head, prevFirst = null;
        // why is prevFirst here??
        boolean isFirstPass = true;
        while(curr != null){
            Node first = curr, prev = null;
            int count = 0;
            while(curr!= null && count < k){
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }
            if(isFirstPass){
                head = prev;
                isFirstPass = false;
            }
            else{
                prevFirst.next = prev;
            }
            prevFirst = first;
        }
        return head;
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
