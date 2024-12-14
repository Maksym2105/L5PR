package app;

import app.models.ListNode;
import app.models.Solution;

public class L5PR {
    public static void main(String[] args) {

        Solution solution = new Solution();

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        System.out.println("Input: " + (head1 == null ? "[]" : head1));
        ListNode reversedHead1 = solution.reverseList(head1);
        System.out.print("Output: ");
        printList(reversedHead1);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);

        System.out.println("\nInput: " + (head2 == null ? "[]" : head2));
        ListNode reversedHead2 = solution.reverseList(head2);
        System.out.print("Output: ");
        printList(reversedHead2);

        ListNode head3 = null;

        System.out.println("\nInput: " + (head3 == null ? "[]" : head3));
        ListNode reversedHead3 = solution.reverseList(head3);
        System.out.print("Output: ");
        printList(reversedHead3);

    }

    public static void printList(ListNode head) {
        if (head == null) {
            System.out.println("[]");
            return;
        }
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + (current.next != null ? " , " : ""));
            current = current.next;
        }
        System.out.println();
    }
}