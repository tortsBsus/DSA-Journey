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
        ListNode current = head;
        while(current!=null)
        {
            if(current.next==null || current.next.val!=current.val)
            {
                current = current.next;
            }
            else
            {
                current.next = current.next.next;                
            }
        }
        return head;
    }
}