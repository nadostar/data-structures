/**
 * SinglyLinkedList
 */
public class SinglyLinkedList<T> {
    private Node head;

    static class Node<T> {
        T data;
        Node next;

        public Node() {
        }

        public Node(T data) {
            this.data = data;
        }
    }

    public SinglyLinkedList() {
        this.head = new Node();
    }

    public Node getHead() {
        return this.head;
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

    public void removeDups() {
        Node n = this.head;

        while (n != null && n.next != null) {
            Node runner = n;
            while (runner.next != null) {
                if (n.data == runner.next.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }

            n = n.next;
        }
    }

}