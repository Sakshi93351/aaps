

class Node {
    int data;
    Node next;
    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

class ques26 {
    static Node deleteNthNodeFromEnd(Node head, int n) {
        int k = 0;
        Node curr = head;
        
        while (curr != null) {
            curr = curr.next;
            k++;
        }
        
        if (k - n == 0) return head.next;
        
        
        curr = head;
        for (int i = 1; i < k - n; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = deleteNthNodeFromEnd(head, 4);

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
// Time Complexity: O(n) for finding the length of the list and O(n) for deleting the node
// Space Complexity: O(1) as we are not using any extra space for storing nodes