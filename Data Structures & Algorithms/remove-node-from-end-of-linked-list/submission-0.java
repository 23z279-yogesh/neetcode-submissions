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
        if(head==null){
            return null;
        }
        List<ListNode> nodes = new ArrayList<>();
        ListNode cur = head;
        while(cur != null){
            nodes.add(cur);
            cur = cur.next;

        }
        int removenode = nodes.size()-n;
        if(removenode==0){
            return head.next;
        }
        nodes.get(removenode-1).next=nodes.get(removenode).next;
        return head;





    }
}
