package easy.ex21_MergeTwoSortedList;

/*
    we've two heads of two linked lists which are sorted.
    we need to return a head of new sorted list with every element in those lists.
    to achieve this we'll create a dummy node where we append the elements from two lists and return its next which would be
    the head of merged list.
    we also point a temp current node to dummy node and traverse it with every new node.
 */
public class Solution {

    // the method which return head of new list of two merged lists list1 and list2
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // dummy node
        ListNode dummy = new ListNode(0);
        // temp current node pointing to dummy node.
        ListNode current = dummy;

        /* we'll use while loop until any of list is null */
        while (list1 != null && list2 != null){
            // to sort out list we check if the value of node in list 1 is less than equal to the node in list 2
            // if it is we'll point curr node next to the list1 node and list 1 to its next node
            if (list1.val <= list2.val){
                current.next = list1;
                list1 = list1.next;
            }
            // else vice versa
            else {
                current.next = list2;
                list2 = list2.next;
            }
            // then we point curr to its next i.e. newly added node
            current = current.next;
        }

        // if any list is ended then the loop will break, and we check if any list have remaining items
        // if it is then we point curr next to the remaining list as it is already sorted
        // the remaining list is already sorted

        current.next = list1 != null ? list1 : list2;

        // return head of merged list i.e. next of dummy node.
        return dummy.next;
    }

    public static void main(String[] args) {

    }
}

