/* Structure of linked list Node
class Node
{
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    int getKthFromLast(Node head, int k) {
        
        Node fast = head;
        Node slow = head;
        
        // Move fast pointer k steps ahead
        for(int i = 0; i < k; i++) {
            if(fast == null) {
                return -1;
            }
            fast = fast.next;
        }
        
        // Move both pointers until fast reaches end
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow.data;
    }
}