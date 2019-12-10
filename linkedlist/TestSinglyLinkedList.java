
class Reference {
    public int count;
}

/**
 * TestSinglyLinkedList
 */
public class TestSinglyLinkedList {

    public static void main(String[] args) {
        System.out.println("\nTest Singly Linked List");
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

        // using hash set O(n)
        // time: O(n^2), space: O(1)
        System.out.println("\nTest remove duplicate data with runner point");
        ll = new SinglyLinkedList<Integer>();
        ll.append(3);
        ll.append(2);
        ll.append(1);
        ll.append(2);
        ll.append(4);
        ll.retrieve();
        ll.removeDups();
        ll.retrieve();

        System.out.println("\nTest remove duplicate data with runner point");
        ll = new SinglyLinkedList<Integer>();
        ll.append(1);
        ll.append(1);
        ll.retrieve();
        ll.removeDups();
        ll.retrieve();

        System.out.println("\nTest with recursion from last find k case1");
        ll = new SinglyLinkedList<Integer>();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.retrieve();

        int k = 3;
        KthToLast(ll.getHead(), k);

        System.out.println("\nTest with recursion from last find k case2 ");
        ll = new SinglyLinkedList<Integer>();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.retrieve();
        Reference r = new Reference(); // java not support -> &point
        SinglyLinkedList.Node found = KthToLast(ll.getHead(), k, r);
        System.out.println(found.data);

        System.out.println("\nTest with recursion from last find k case3 ");
        ll = new SinglyLinkedList<Integer>();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.retrieve();
        found = KthToLastP(ll.getHead(), k);
        System.out.println(found.data);
    }

    public static int KthToLast(SinglyLinkedList.Node n, int k) {
        if (n == null) {
            return 0;
        }

        int count = KthToLast(n.next, k) + 1;
        if (count == k) {
            System.out.println(k + "th to last node is " + n.data);
        }
        return count;
    }

    public static SinglyLinkedList.Node KthToLast(SinglyLinkedList.Node n, int k, Reference r) {
        if (n == null) {
            return null;
        }

        SinglyLinkedList.Node found = KthToLast(n.next, k, r);
        r.count++;
        if (r.count == k) {
            return n;
        }
        return found;
    }

    public static SinglyLinkedList.Node KthToLastP(SinglyLinkedList.Node first, int k) {
        SinglyLinkedList.Node p1 = first;
        SinglyLinkedList.Node p2 = first;

        if (p1 == null) return null;

        for (int i = 0; i < k; i++) {
            if (p1 == null) return null;

            p1 = p1.next;
        }

        while(p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;
    }
}