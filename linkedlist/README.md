# Linked List

```
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

Node n1 = new Node(5);
n1.next = new Node(15);
n1.next.next = new Node(15);
```

### Singly linked list
[x] -> [y] -> [z]


### doubly linked list
[x] <-> [y] <-> [x]