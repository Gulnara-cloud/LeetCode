public class L_876_MiddleOfTheLinkedList {
    public static class ListNode {
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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        L_876_MiddleOfTheLinkedList solution = new L_876_MiddleOfTheLinkedList();
        ListNode middle = solution.middleNode(head);

        System.out.print("[");
        while (middle != null) {
            System.out.print(middle.val);
            if (middle.next != null) {
                System.out.print(", ");
            }
            middle = middle.next;
        }
        System.out.println("]");
    }
}


