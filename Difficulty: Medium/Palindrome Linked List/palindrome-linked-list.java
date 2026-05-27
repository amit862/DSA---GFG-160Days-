/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        
        if(head == null || head.next == null) {
            return true;
        }
        
        // Find middle of linked list
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Reverse second half
        Node prev = null;
        Node curr = slow;
        
        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        // Compare first half and second half
        Node first = head;
        Node second = prev;
        
        while(second != null) {
            if(first.data != second.data) {
                return false;
            }
            
            first = first.next;
            second = second.next;
        }
        
        return true;
    }
}