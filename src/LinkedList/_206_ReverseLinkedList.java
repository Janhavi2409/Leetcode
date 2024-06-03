package LinkedList;

public class _206_ReverseLinkedList {
    public SLL.Node reverseList(SLL.Node head) {
        SLL.Node previous = null;
        SLL.Node current = head;
        while (current != null) {
            SLL.Node temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }
}
