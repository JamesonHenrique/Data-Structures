package list.leetcode;
//Leetcode #21
import list.SinglyLinkedList;


    public class MergeTwoSortedLists extends SinglyLinkedList {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(l1!=null && l2!=null){

            if((int) l1.data <= (int) l2.data) {
                curr.next = l1;
                l1=l1.next;
            }
            else{
                curr.next = l2;
                l2=l2.next;
            }
            curr= curr.next;
        }
        curr.next= l1!=null ? l1 : l2;
        return dummy.next;
    }
        public static void main(String[] args) {
            ListNode l1 = new ListNode(1);
            l1.next = new ListNode(6);
            l1.next.next = new ListNode(10);

            ListNode l2 = new ListNode(2);
            l2.next = new ListNode(4);
            l2.next.next = new ListNode(15);


            SinglyLinkedList mergedList = new SinglyLinkedList();
            mergedList.head = mergeTwoLists(l1, l2);
            mergedList.display();
        }}
