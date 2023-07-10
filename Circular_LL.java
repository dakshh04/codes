import java.util.Scanner;

public class Main {
    static class Node {
        int data;
        Node next;
    }

    static Node addToEmpty(Node head, int data) {
        if (head != null)
            return head;
        Node temp = new Node();
        temp.data = data;
        head = temp;
        head.next = head;
        return head;
    }

    static Node addBegin(Node head, int data) {
        if (head == null)
            return addToEmpty(head, data);

        Node temp = new Node();
        temp.data = data;
        temp.next = head.next;
        head.next = temp;

        return head;
    }

    static void traverse(Node head) {
        Node p;

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        p = head;
        do {
            System.out.print(p.data + " ");
            p = p.next;
        } while (p != head);
    }

    static Node exchangeNodes(Node head) {
        Node p = head;
        while (p.next.next != head)
            p = p.next;

        p.next.next = head.next;
        head.next = p.next;
        p.next = head;
        head = head.next;

        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++)
            arr[i] = scanner.nextInt();

        Node head = null;
        head = addToEmpty(head, arr[0]);

        for (int i = m - 1; i > 0; i--)
            head = addBegin(head, arr[i]);

        System.out.print("Before Swap: ");
        traverse(head);
        System.out.println();

        System.out.print("After Swap: ");
        head = exchangeNodes(head);
        traverse(head);

        scanner.close();
    }
}