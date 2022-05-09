public class MergedList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listCur = new ListNode();
        ListNode listHead = listCur;
        // if both lists contain values
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                listCur.next = new ListNode(list1.val);
                listCur = listCur.next;
                list1 = list1.next;
            } else {
                listCur.next = new ListNode(list2.val);
                listCur = listCur.next;
                list2 = list2.next;
            }
        }
        // if list2 == null iterate list1 till empty
        while (list1 != null) {
            listCur.next = new ListNode(list1.val);
            listCur = listCur.next;
            list1 = list1.next;
        }
        while (list2 != null) {
            listCur.next = new ListNode(list2.val);
            listCur = listCur.next;
            list2 = list2.next;
        }
        // return first listnode
        return listHead.next;
    }
}