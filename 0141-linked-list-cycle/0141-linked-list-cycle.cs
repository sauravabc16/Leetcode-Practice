/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public bool HasCycle(ListNode head) {
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