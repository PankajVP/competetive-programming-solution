package leetcode;

class AddNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return resultNode(l1, l2, 0);
    }

    private ListNode resultNode(ListNode l1, ListNode l2, int additionNum) {

        int add = additionNum + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);

        if (l1 != null || l2 != null || additionNum > 0) {
            ListNode ln = new ListNode();
            ln.val = add % 10;
            ln.next = resultNode(l1 != null ? l1.next : null, l2 != null ? l2.next : null, add >= 10 ? (add / 10) : 0);
            return ln;
        } else return null;
    }
}

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}