/**
 * TestSinglyLinkedList
 */
public class TestSinglyLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList<Integer> ll = new SinglyLinkedList<Integer>();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.retrieve();
        ll.delete(3);
        ll.retrieve();
        ll.delete(1);
        ll.retrieve();
    }
}