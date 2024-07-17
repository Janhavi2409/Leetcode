package LinkedList;
import LinkedList.SLL.Node;

public class _206_ReverseLinkedList {
    public Node reverseList(Node head) {
        Node previous = null;
        Node current = head;
        while (current != null) {
            Node temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }
}
