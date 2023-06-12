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

