package LinkedList;

public class _83_RemoveDuplicateFromSortedList {
    public SLL.Node deleteDuplicates(SLL.Node head) {
        if (head == null) return null;
        SLL.Node current = head;
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
