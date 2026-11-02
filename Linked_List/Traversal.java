package LinkedLIst;

public class Traversal {
    public static Node head;
    public static Node tail;
    public static int size;

    public static void insertAtEnd(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public static void insertAtStart(int val) {
        Node node = new Node(val);
        node.next = head;
        tail = node;
        if (head == null) {
            head = node;
        }
        size += 1;
    }

    public static void insertAt(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = node;
        }
        size += 1;
    }

    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void count() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp= temp.next;
        }
        System.out.println("Nodes count -> "+count);
    }
    public static void main(String[] args) {
        insertAtEnd(1);
        insertAtEnd(2);
        insertAtEnd(3);
        insertAtEnd(4);
        insertAtEnd(5);
        display();
        count();

    }
}
