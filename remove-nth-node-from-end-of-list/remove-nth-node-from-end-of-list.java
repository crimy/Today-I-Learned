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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode now = head;
        ListNode target = head;
        int sz = 1;
        int index = 1;
        while( now.next != null ) {
            now = now.next;
            sz++;
        }
        if( sz == 1 ) {
        	return null;
        }
        if( sz == n ) {
        	if( head.next != null ) return head.next;
        	else return null;
        }
        while( index < sz - n ) {
            target = target.next;
            index++;
        }
        if( target.next.next != null ) {
        	target.next = target.next.next;
        } else {
        	target.next = null;
        }
        
        return head;
    }
}