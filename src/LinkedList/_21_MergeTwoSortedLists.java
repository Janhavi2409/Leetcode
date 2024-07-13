package LinkedList;

public class _21_MergeTwoSortedLists {
    public SLL.Node mergeTwoLists(SLL.Node list1, SLL.Node list2) {
        SLL.Node newList = null;
        SLL.Node tail = null;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                if (tail == null) {
                    tail = list1;
                    newList = tail;
                } else {
                    tail.next = list1;
                    tail = tail.next;
                }
                list1 = list1.next;
            } else {
                if (tail == null) {
                    tail = list2;
                    newList = tail;
                } else {
                    tail.next = list2;
                    tail = tail.next;
                }
                list2 = list2.next;
            }
        }
        if (tail != null) {
            tail.next = (list1 != null) ? list1 : list2;
        } else {
            newList = (list1 != null) ? list1 : list2;
        }

        return newList;
    }
}
