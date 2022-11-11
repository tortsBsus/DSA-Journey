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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //if either of the list is empty
        if(list1==null)
        {
           return list2;
        }
        if(list2==null)
        {
            return list1;
        }
        
        ListNode head=null;
        ListNode merged=null;
        while(list1!=null&&list2!=null)
        {
           
            ListNode selected;
            if(list1.val<=list2.val)
            {
                selected = list1;
                list1 = list1.next;
            }
            else
            {
                selected = list2;
                list2 = list2.next;
            }
           if(merged==null)
           {
              merged = selected;
               head = merged;
           }
            else{
                merged.next = selected;
                merged = merged.next;
            }        
            
        }
         if(list1==null)
        {
          merged.next  = list2;
             
        }
        if(list2==null)
        {
            merged.next = list1;
        }
        return head;
        
    }
    
    
}