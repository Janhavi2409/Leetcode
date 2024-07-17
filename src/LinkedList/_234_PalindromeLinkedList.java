package LinkedList;
import LinkedList.SLL.Node;
import java.util.ArrayList;

public class _234_PalindromeLinkedList {
    public boolean isPalindrome(Node head) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            if (list.get(left) != list.get(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
