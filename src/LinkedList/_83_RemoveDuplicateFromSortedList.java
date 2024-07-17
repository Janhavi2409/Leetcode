package LinkedList;
import LinkedList.SLL.Node;

public class _83_RemoveDuplicateFromSortedList {
    public Node deleteDuplicates(Node head) {
        if (head == null) return null;
        Node current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
