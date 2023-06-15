import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void delete(int data) {
        if (head == null) {
            // System.out.println("Linked list is empty.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            // System.out.println("Element not found in the linked list.");
            return;
        }

        prev.next = current.next;
    }

    public void update(int index, int data) {
        if (head == null) {
            // System.out.println("Linked list is empty.");
            return;
        }

        Node current = head;
        int count = 0;
        while (current != null && count != index) {
            current = current.next;
            count++;
        }

        if (current == null) {
            // System.out.println("Index out of range.");
            return;
        }

        current.data = data;
    }

    public void search(int data) {
        if (head == null) {
            // System.out.println("Linked list is empty.");
            return;
        }

        Node current = head;
        int index = 0;
        while (current != null && current.data != data) {
            current = current.next;
            index++;
        }

        if (current == null) {
            // System.out.println("Element not found in the linked list.");
        } else {
            System.out.println( index);
        }
    }

    public void display() {
        if (head == null) {
            // System.out.println("Linked list is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        // System.out.println("null");
    }
}

