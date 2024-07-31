package list.leetcode;

import list.SimplyLinkedList;

import java.util.List;

//Leetcode #206
public class ReverseSimplyLinkedList {


    public static SimplyLinkedList.ListNode reverse(SimplyLinkedList.ListNode head) {
        if (head == null) {
            return null;
        }
        SimplyLinkedList.ListNode current = head;
        SimplyLinkedList.ListNode prev = null;
        SimplyLinkedList.ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void display(SimplyLinkedList.ListNode head) {
        SimplyLinkedList.ListNode current = head;

        while (current != null) {

            System.out.print(((SimplyLinkedList.ListNode<?>) current).data + " --> ");
            current = current.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        SimplyLinkedList sll = new SimplyLinkedList();

        SimplyLinkedList.ListNode head = new SimplyLinkedList.ListNode(1);
        SimplyLinkedList.ListNode second = new SimplyLinkedList.ListNode(5);
        SimplyLinkedList.ListNode third = new SimplyLinkedList.ListNode(8);
        head.next = second;
        second.next = third;
        display(head);
        SimplyLinkedList.ListNode reverseHead = reverse(head);
        System.out.println("After reversing: ");
        display(reverseHead);

    }
}
