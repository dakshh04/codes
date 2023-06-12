import java.util.Scanner;

public class linked_list{
    // create the node 
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
}

class LinkedList{
    Node head;

    public void addNode( int data){
        Node newNode = new Node(data);
        if(head == null){
            head =newNode;

        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
}

public Node reverseIngroups(Node head, int k){

    Node current = head;
    Node prev = null;
    Node next = null;
    int count = 0;

    // reverse the first K nodes

    while(count < k && current != null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                count++;
    }

    // recursively reverse the remaining nodes
    if(next != null){
        head.next = reverseIngroups(next, k);
    }

    return prev;
}

public void displayList(Node head){
    Node current = head;
    while (current != null){
        System.out.print(current.data + " ");
        current = current.next;
    }
    System.out.println();
}


