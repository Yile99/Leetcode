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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode end = dummy;
        while(end.next != null){
            for(int i = 0; i<k && end !=null;i++){
                end = end.next;
            }
            if(end ==null){
                break;
            }
            //断开前先指定指向，不然断开之后找不到
            ListNode next = end.next;
            end.next =null;
            ListNode start = pre.next;
            pre.next =null;
            pre.next = reverseList(start);
            start.next = next;
            pre = start;
            end = start;

        }
        return dummy.next;
    }
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next == null){
            return head;
        }
        ListNode cur = reverseList(head.next);
        head.next.next =head;
        head.next=null;
        return cur;
        }
    }
