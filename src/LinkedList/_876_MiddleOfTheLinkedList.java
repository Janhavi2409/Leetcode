package LinkedList;

public class _876_MiddleOfTheLinkedList {
    public SLL.Node middleNode(SLL.Node head) {
        SLL.Node fast = head;
        SLL.Node slow = head;
        int count = 0;
        while (head.next != null) {
            count += 1;
            head = head.next;
        }
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (count % 2 == 0) {
            return slow;
        }
        return slow.next;
    }
}
