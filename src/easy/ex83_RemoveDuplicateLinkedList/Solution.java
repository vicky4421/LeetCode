package easy.ex83_RemoveDuplicateLinkedList;

import java.util.ArrayList;

/*
    we'll take a prev pointer to point at head.
    a temp node to point at prev.next

    we'll loop while temp != null

    we'll compare prev node value to temp value, if it is equal then we'll skip the loop
    if not we'll point prev next to temp which will drop the duplicate values in between.
    prev.next to temp
    then we'll move pointers
    prev to temp and
    temp to temp.next
    temp to temp.next

    after finishing the loop we'll point temp.next to null.
    and return the head.
 */

public class Solution {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode prev = head;
        ListNode temp = prev.next;

        while (temp != null){
            if (temp.val == prev.val) {
                temp = temp.next;
                continue;
            };
            prev.next = temp;
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return head;
    }

    public static void main(String[] args) {

    }
}
