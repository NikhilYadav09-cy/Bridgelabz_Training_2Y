package LinkedLIst;

public class Basic1 {
    public static void main(String[] args) {
        Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = new Node(3);
        a.next.next.next = new Node(4);
        a.next.next.next.next = new Node(5);
        a.next.next.next.next.next = new Node(6);
        a.next.next.next.next.next.next = new Node(7);
        a.next.next.next.next.next.next.next = new Node(8);
        a.next.next.next.next.next.next.next.next = new Node(9);
        a.next.next.next.next.next.next.next.next.next.next = new Node(10);
        System.out.println(a.data);
        System.out.println(a.next.data + "->");
        System.out.println(a.next.next.data + "->");
        System.out.println(a.next.next.next.data + "->");
        System.out.println(a.next.next.next.next.data + "->");
        System.out.println(a.next.next.next.next.next.data + "->");
        System.out.println(a.next.next.next.next.next.next.next.data + "->");
        System.out.println(a.next.next.next.next.next.next.next.next.data + "->");
        System.out.println(a.next.next.next.next.next.next.next.next.next.data + "->");
    }
}