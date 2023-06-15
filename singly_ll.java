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

public class singly_ll {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // System.out.println("\nMENU");
            // System.out.println("1. Insert");
            // System.out.println("2. Delete");
            // System.out.println("3. Update");
            // System.out.println("4. Search");
            // System.out.println("5. Display");
            // System.out.println("6. Exit");

            // System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // System.out.print("Enter the element(s) to insert (space-separated): ");
                    scanner.nextLine(); // Consume newline character
                    String[] elements = scanner.nextLine().split(" ");
                    for (String element : elements) {
                        linkedList.insert(Integer.parseInt(element));
                    }
                    // System.out.println("Elements inserted successfully.");
                    break;

                case 2:
                    // System.out.print("Enter the element(s) to delete (space-separated): ");
                    scanner.nextLine(); // Consume newline character
                    elements = scanner.nextLine().split(" ");
                    for (String element : elements) {
                        linkedList.delete(Integer.parseInt(element));
                    }
                    // System.out.println("Elements deleted successfully.");
                    break;

                case 3:
                    // System.out.print("Enter the index of the element to update: ");
                    int index = scanner.nextInt();
                    // System.out.print("Enter the new data: ");
                    int data = scanner.nextInt();
                    linkedList.update(index, data);
                    // System.out.println("Element updated successfully.");
                    break;

                case 4:
                    // System.out.print("Enter the element to search: ");
                    data = scanner.nextInt();
                    linkedList.search(data);
                    break;

                case 5:
                    linkedList.display();
                    break;

                case 6:
                    // System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);

                default:
                    // System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
