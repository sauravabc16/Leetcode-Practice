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
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> hs = new HashSet<>();
         ListNode curr = head;
         ListNode prev = head;
         
         while(curr!=null){
             if(hs.contains(curr.val)){
                 prev.next = prev.next.next;
             }else{
                 hs.add(curr.val);
                 prev = curr;
             }
             curr=curr.next;
         }
         return head;
    }
}