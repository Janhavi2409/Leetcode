package LinkedList;

import java.util.HashSet;
import java.util.Set;

import static LinkedList.SLL.Node;

public class _3217_DeleteNodeFromLinkedListPresentInArray {
    public Node modifiedList(int[] nums, Node head) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        Node dummy = new Node();
        dummy.next = head;
        Node current = dummy;

        while (current.next != null) {
            if (numSet.contains(current.next.val)) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return dummy.next;
    }
}
