class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

public class intersection_LL{

    Node head1, head2;

    static int getLength(Node node){
        Node curr = node;
        int count = 0;
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        return count;
    }

    int getNode(){
        int c1 = getLength(head1);
        int c2 = getLength(head2);
        int d;
        
        if(c1>c2){
            d = c1 - c2;
            return getIntersection(d, head1, head2);
        }
        else{
            d = c2 - c1;
            return getIntersection(d, head2, head1);
        }
    }

    static int getIntersection(int d, Node node1, Node node2){
        Node curr1 = node1;
        Node curr2 = node2;
        for(int i = 0; i < d;i++){
            if(curr1 == null){
                return -1;
            }
            curr1 = curr1.next;
        }
        while(curr1!=null && curr2!=null){
            if(curr1.data == curr2.data){
                return curr1.data;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return -1;
    }

    public static void main(String [] args){
        intersection_LL list = new intersection_LL();

        list.head1 = new Node(3); 
		list.head1.next = new Node(6); 
		list.head1.next.next = new Node(9); 
		list.head1.next.next.next = new Node(15); 
		list.head1.next.next.next.next = new Node(30); 

		list.head2 = new Node(10); 
		list.head2.next = new Node(15); 
		list.head2.next.next = new Node(30);

        System.out.println(list.getNode());
    }
}