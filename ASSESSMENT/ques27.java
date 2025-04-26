

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class ques27 {
  
    static Node intersectPoint(Node head1, Node head2) {

        Node ptr1 = head1;
        Node ptr2 = head2;
        if (ptr1 == null || ptr2 == null)
            return null;

        while (ptr1 != ptr2) {
          
            ptr1 = (ptr1 != null) ? ptr1.next : head2;
            ptr2 = (ptr2 != null) ? ptr2.next : head1;
        }
        return ptr1;
    }

    public static void main(String[] args) {
              Node head1 = new Node(10);
        head1.next = new Node(15);
        head1.next.next = new Node(30);
        Node head2 = new Node(3);
        head2.next = new Node(6);
        head2.next.next = new Node(9);
      
        head2.next.next.next = head1.next;

        Node intersectionPoint = intersectPoint(head1, head2);

        if (intersectionPoint == null)
            System.out.println("-1");
        else
            System.out.println(intersectionPoint.data);
    }
}
// Time Complexity: O(m+n) where m and n are the lengths of the two linked lists
// Space Complexity: O(1) as we are not using any extra space for storing nodes

