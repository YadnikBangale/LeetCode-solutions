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
    public ListNode removeNodes(ListNode head) {
        
        ListNode prev = null;
        ListNode curr = head;
       
        while(curr != null) {

            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        ListNode revCurr = prev;
        int max = revCurr.val;

        while(revCurr != null && revCurr.next != null) {

            if(revCurr.next.val >= max) {

                max = revCurr.next.val;
                revCurr = revCurr.next;
            }

            else {
                revCurr.next = revCurr.next.next;
            }
        }


        //reverse again
        ListNode newHead = prev;
        curr = newHead;
        prev = null;

        while(curr != null){

            ListNode nextNode1 = curr.next;

            curr.next = prev;
            prev = curr;
            curr = nextNode1;
        }


        return prev;
    }
}