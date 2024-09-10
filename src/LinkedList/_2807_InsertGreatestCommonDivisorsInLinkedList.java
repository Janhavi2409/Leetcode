package LinkedList;

public class _2807_InsertGreatestCommonDivisorsInLinkedList {
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;

        while (current != null && current.next != null) {
            int gcdValue = gcd(current.val, current.next.val);
            ListNode gcdNode = new ListNode(gcdValue);
            gcdNode.next = current.next;
            current.next = gcdNode;
            current = gcdNode.next;
        }

        return head;
    }
}
