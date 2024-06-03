package LinkedList;

public class _141_LinkedListCycle {
    public boolean hasCycle(SLL.Node head) {
        SLL.Node slow = head;
        SLL.Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
