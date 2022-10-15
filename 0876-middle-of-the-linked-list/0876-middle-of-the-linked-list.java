/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode onestep=head;
        ListNode twostep=head;
        while(twostep != null && twostep.next !=null){
            twostep=twostep.next.next;
            onestep=onestep.next;
            
        }
        return onestep;
    }
}

