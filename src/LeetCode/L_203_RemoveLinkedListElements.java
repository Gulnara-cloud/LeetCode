public class L_203_RemoveLinkedListElements {
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
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val != val) {
                current = current.next;
            } else {
                current.next = current.next.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        // создаём список: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(6,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5,
                                                        new ListNode(6)
                                                )
                                        )
                                )
                        )
                )
        );
        L_203_RemoveLinkedListElements solution = new L_203_RemoveLinkedListElements();
        ListNode result = solution.removeElements(head, 6);
        // вывод результата
        printList(result);
    }
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }
}

