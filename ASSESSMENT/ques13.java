class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ques13 {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Create a dummy node to start the merged list
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Traverse both lists and pick the smaller value each time
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Attach the remaining part, if any
        if (l1 != null) current.next = l1;
        if (l2 != null) current.next = l2;

        // Return the next node after dummy, which is the head of the merged list
        return dummy.next;
    }

    // Helper method to print the list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        // Creating first sorted list: 1 -> 3 -> 5
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        // Creating second sorted list: 2 -> 4 -> 6
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        // Merging both lists
        ListNode mergedHead = mergeTwoLists(l1, l2);

        // Print result
        System.out.println("Merged Sorted Linked List:");
        printList(mergedHead);
    }
}
