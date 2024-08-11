package list.leetcode;

import list.SinglyLinkedList;

//Leetcode #2
public class AddTwoNumbers extends SinglyLinkedList {

        public static ListNode add(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode(0);
            ListNode curr = dummy;
            int carry = 0;
            while (l1 != null || l2 != null) {
                int sum = carry;
                if (l1 != null) {
                    sum += (int) l1.data;
                    l1 = l1.next;
                }
                if (l2 != null) {
                    sum += (int) l2.data;
                    l2 = l2.next;
                }
                curr.next = new ListNode(sum % 10);
                carry = sum / 10;
                curr = curr.next;
            }
            if (carry > 0) {
                curr.next = new ListNode(carry);
            }
            return dummy.next;
        }

        public static void main(String[] args) {
            ListNode l1 = new ListNode(2);
            l1.next = new ListNode(4);
            l1.next.next = new ListNode(3);

            ListNode l2 = new ListNode(5);
            l2.next = new ListNode(5);
            l2.next.next = new ListNode(4);

            SinglyLinkedList sumList = new SinglyLinkedList();
            sumList.head = add(l1, l2);
            sumList.display();
        }
}
