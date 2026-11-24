package LinkedLIst.Searching.DoublyLinkedList;


public class Basic {
    public static class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
    }
}
        public static Node head;
        public static Node tail;
        public static int size ;

        public static void Display(Node head){
            Node temp;
            temp = head;
            while(temp!=null){
                System.out.print(temp.data+"_->");
                temp = temp.next;
            }
            System.out.println("null");
        }
        public static void displayr(Node tail){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data+"_->");
            temp = temp.prev;
        }
        System.out.println("null");
        }
    public static void insertAtEnd(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = tail = node;
        }
        else{
            tail.next = node;
            tail=node;
        }
        size++;
    }
        public static void main(String[] args) {

            Node a = new Node(1);
            Node b = new Node(2);
            Node c = new Node(3);
            Node d = new Node(4);
            Node e = new Node(5);
            a.prev = null;
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;

            e.prev = d;
            d.prev = c;
            c.prev = b;
            b.prev = a;
            Display(a);
            displayr(e);
        }
    }
