class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

public class detectLoop_Floyd {
    static boolean detectLoop(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

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
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = head.next;
        // printList(head); Infinite Loop
        System.out.println(detectLoop(head));

    }
}
