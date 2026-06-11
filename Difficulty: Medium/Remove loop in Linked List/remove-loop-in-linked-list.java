/* Structure of linked list Node
class Node {
    int data;
    Node next;
    Node(int val) {
        data = val;
        next = null;
    }
} */

class Solution {
    public static void removeLoop(Node head) {
        if (head == null || head.next == null) {
            return;
        }

        Node slow = head;
        Node fast = head;
        boolean loopExists = false;

        // Detect loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                loopExists = true;
                break;
            }
        }

        if (!loopExists) {
            return;
        }

        // Special case: loop starts at head
        slow = head;
        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
            return;
        }

        // Find start of loop
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove loop
        fast.next = null;
    }
}