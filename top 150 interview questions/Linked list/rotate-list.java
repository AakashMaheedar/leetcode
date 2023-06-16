/**
 * Definition for singly-linked list.
 * public class Input: head = [1,2], n = 1
Output: [1] {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode fast ;
        ListNode slow ;
        ListNode dummy = new ListNode(0);
        fast = slow = dummy;
        dummy.next = head;
        if(head==null || head.next ==null){
            return head;
        }
        int length ;
        for(length =0 ;fast.next!=null;length++){
            fast = fast.next;
        }

        for(int j = length - k %length ; j >0; j --){
            slow = slow.next;
        }

        fast.next = dummy.next;
        dummy.next = slow.next;
        slow.next = null;
        
        return dummy.next;
    }
}

/*
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]

Input: head = [0,1,2], k = 4
Output: [2,0,1]
*/