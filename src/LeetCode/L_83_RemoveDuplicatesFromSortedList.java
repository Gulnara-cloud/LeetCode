public class L_83_RemoveDuplicatesFromSortedList {

    // Внутренний класс узла списка
    static class ListNode {
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

    // Само решение задачи
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // пропускаем дубликат
                current.next = current.next.next;
            } else {
                // переходим к следующему узлу
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        // создаём список: 1 -> 1 -> 2 -> 3 -> 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        L_83_RemoveDuplicatesFromSortedList solution = new L_83_RemoveDuplicatesFromSortedList();
        ListNode result = solution.deleteDuplicates(head);

        printList(result);
    }
    // вспомогательный метод для вывода списка
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
