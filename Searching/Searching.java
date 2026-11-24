package LinkedLIst.Searching;
public class Searching {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
        }
        public static Node head;
        public static Node tail;
        public static int size;

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
        public static void insertAtStart(int val){
            Node node = new Node(val);
            node.next= head;
            tail=node;
            if(head==null){
                head=node;
            }
            size++;
        }
        public static void insertAt(int val) {
            Node node = new Node(val);
            node.next= head;
            head=node;
            if(tail==null){
                tail=node;
            }
            size+=1;
        }
        public static void display() {
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" --> ");
                temp = temp.next;
          }
            System.out.println("Null");
    }
    public static void count(){
            Node temp = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            System.out.println("Node Count : "+count);
    }
    public static Node Mid(){
        Node a = head;
        Node b = head;
        while(a.next!=null&&a.next.next!=null){
            b=b.next;
            a=a.next.next;
        }
        return b;
    }
    public static void main(String[] args) {
        insertAtStart(0);
        insertAtEnd(1);
        insertAtEnd(2);
        insertAtEnd(3);
        insertAtEnd(4);
        insertAtEnd(5);
        display();
        count();
        System.out.println(Mid().data);

    }
}
