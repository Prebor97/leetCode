/**

 Add Two Numbers
 You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Example 1:
 Input: l1 = [2,4,3], l2 = [5,6,4] Output: [7,0,8] Explanation: 342 + 465 = 807.

 Example 2:
 Input: l1 = [0], l2 = [0] Output: [0]

 Example 3:
 Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9] Output: [8,9,9,9,0,0,0,1]

 **/

public class LinkedListSum {
    public ListNode addTwoLists(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;
        while(l1!=null||l2!=null|carry!=0){
            int sum = carry;
            if (l1!=null){
                sum+= l1.val;
                l1=l1.next;
            }
            if (l2!=null){
                sum+=l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            current.next = new ListNode(sum%10);
            current = current.next;
        }
        return dummyHead.next;
    }
    public int [] dummyArray(ListNode list){
        int counter = 0;
        while (list != null) {
            counter += 1;
            list = list.next;
        }
        return new int[counter];
    }

    public ListNode addLinkedValue(ListNode head, int val){
        if (head==null){
        return new ListNode(val);
        }
        ListNode current = head;
        while (current.next!=null){
            current = current.next;
        }
        current.next = new ListNode(val);
        return head;
    }
    public void outPutList(ListNode list){
        list = list.next;
        System.out.print("[ ");
        while (list!=null){
            System.out.print(list.val);
            if (list.next!=null){
                System.out.print(" ");
            }
            list = list.next;
        }
        System.out.print(" ]");
        System.out.println();
    }
    public void outPutList(ListNode list, int [] linkedArray){
        int counter = 0;
        while (list != null) {
            linkedArray[counter] = list.val;
            list = list.next;
            counter += 1;
        }
        for (int i = counter-1; i > 0 ; i--){
            System.out.print(linkedArray[i]);
        }
    }
}
