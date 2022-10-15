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
    public ListNode DetectCycle(ListNode head) {
        ListNode onestep,twostep;
        onestep=twostep=head;
        while(twostep != null && twostep.next !=null){
            twostep=twostep.next.next;
            onestep=onestep.next;
            if(onestep == twostep){
                onestep=head;
                while(onestep!=twostep){
                    onestep=onestep.next;
                    twostep=twostep.next;
                }
                return onestep;
            }
            
        }
        return null;
    }
}