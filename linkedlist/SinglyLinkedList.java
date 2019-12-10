/**
 * SinglyLinkedList
 */
public class SinglyLinkedList<T> {
    private Node head;

    class Node<T> {
        private T data;
        private Node next;

        public Node() {}

        public Node(T data) {
            this.data = data;
        }
    }

    public SinglyLinkedList() {
        this.head = new Node();
    }

    public void append(T data) {
        Node end = new Node(data);

        Node n = this.head;
        while (n.next != null) {
            n = n.next;
        }

        n.next = end;
    }

    public void delete(T data) {
        Node n = this.head;

        while (n.next != null) {
            if (n.next.data == data) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }
    }

    public void retrieve() {
        Node n = this.head.next;

        while (n.next != null) {
            System.out.print(n.data + " -> ");

            n = n.next;
        }

        System.out.println(n.data);
    }

}