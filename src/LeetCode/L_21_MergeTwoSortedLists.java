class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class L_21_MergeTwoSortedLists {

    // Основная функция для LeetCode
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // "Фиктивный" узел для удобства склеивания
        ListNode dummy = new ListNode(-1);

        // Указатель, который будет двигаться
        ListNode current = dummy;

        // Пока оба списка не пустые
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;   // добавляем list1
                list1 = list1.next;     // двигаем list1 вперёд
            } else {
                current.next = list2;   // добавляем list2
                list2 = list2.next;     // двигаем list2 вперёд
            }
            current = current.next;      // сдвигаем указатель
        }
        // Если один из списков ещё остался — приклеиваем хвост
        if (list1 != null) current.next = list1;
        if (list2 != null) current.next = list2;

        // Возвращаем новый отсортированный список (после dummy)
        return dummy.next;
    }
    public static void main(String[] args) {

        // Создаём первый список: 1 → 2 → 4
        ListNode a = new ListNode(1, new ListNode(2, new ListNode(4)));

        // Создаём второй список: 1 → 3 → 4
        ListNode b = new ListNode(1, new ListNode(3, new ListNode(4)));

        // Создаём объект решения
        L_21_MergeTwoSortedLists solution = new L_21_MergeTwoSortedLists();

        // Запускаем функцию
        ListNode result = solution.mergeTwoLists(a, b);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
