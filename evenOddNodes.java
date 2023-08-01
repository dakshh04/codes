class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

class evenOddNodes{
    static Node segregate(Node head){
        Node es=null, ee=null, os=null, oe=null;
        for(Node curr = head;curr!=null;curr = curr.next){
            int x = curr.data;
            if(x%2 == 0){
                if(es==null){
                    es = curr;
                    ee = curr;
                }
                else{
                    ee.next = curr;
                    ee = ee.next;
                }
            }
            else{
                if(os==null){
                    os = curr;
                    oe = curr;
                }
                else{
                    oe.next = curr;
                    oe = oe.next;
                }
            }
        }
        if(ee==null || oe==null){
            return head;
        }
        ee.next = os;
        oe.next = null;
        return es;
    }

    static void printList(Node head){
        if(head==null) return;
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String [] args){
        Node head = new Node(10);
        head.next = new Node(11);
        head.next.next = new Node(21);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(23);
        head.next.next.next.next.next = new Node(40);
        printList(head);
        head = segregate(head);
        printList(head);
    }
}