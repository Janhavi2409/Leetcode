package LinkedList;

public class _1290_ConvertBinaryNumberInALinkedListToInteger {
    public int getDecimalValue(SLL.Node head) {
        int decimalValue = 0;
        while (head != null) {
            decimalValue = (decimalValue << 1) | head.val;
            head = head.next;
        }
        return decimalValue;
    }
}
