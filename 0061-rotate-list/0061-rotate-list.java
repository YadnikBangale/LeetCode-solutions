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
    public ListNode rotateRight(ListNode head, int k) {
        
        int length = 1;

        if(head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode curr = head;

        while(curr.next != null) {

            curr = curr.next;
            length++;
        }

        curr.next = head;


       int stepsToNewTail = length - (k % length);
       ListNode newTail = head;

       for(int i = 1 ; i < stepsToNewTail; i ++) {

            newTail = newTail.next;
       }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;

       
    }
}
