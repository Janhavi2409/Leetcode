package LinkedList;

public class _725_SplitLinkedListInParts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int length = 0;
        for (ListNode curr = head; curr != null; curr = curr.next) {
            length++;
        }

        int partSize = length / k;
        int extraNodes = length % k;

        ListNode[] parts = new ListNode[k];
        ListNode curr = head;

        for (int i = 0; i < k; i++) {
            parts[i] = curr;
            int currentPartSize = partSize + (extraNodes-- > 0 ? 1 : 0);
            for (int j = 0; j < currentPartSize - 1 && curr != null; j++) {
                curr = curr.next;
            }
            if (curr != null) {
                ListNode next = curr.next;
                curr.next = null;
                curr = next;
            }
        }

        return parts;
    }
}
