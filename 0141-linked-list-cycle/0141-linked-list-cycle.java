/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next == null) return false;  
        
        ListNode slow = head.next;
        head = head.next.next;
        
        while(head != null && head.next != null ){
            if(slow == head)
                return true;
            slow = slow.next;
            head = head.next.next;
        }
        return false;
        
        
        
        
    }
}