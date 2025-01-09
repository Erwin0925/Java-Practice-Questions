package LinkedList;

// Write a Java program to remove the nth element from the end of a given list.
//-----------------------------------------------------------------------------------//

public class question11 {

        public LinkedListNode removeNthFromEnd(LinkedListNode head, int n) {
            LinkedListNode dummy = new LinkedListNode(0);
            dummy.next = head;

            LinkedListNode first = dummy;
            LinkedListNode second = dummy;

            // Step 1: Move `first` pointer `n + 1` steps ahead, if possible
            for (int i = 0; i <= n; i++) {
                first = first.next;
            }


            while (first != null) {
                first = first.next;
                second = second.next;
            }

            second.next = second.next.next;

            return dummy.next;
        }

        public void printList(LinkedListNode head) {
            LinkedListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }

        public void CreateLinkedList(){
            LinkedListNode firstNode = new LinkedListNode(10);
            LinkedListNode secondNode = new LinkedListNode(20);
            LinkedListNode thirdNode = new LinkedListNode(30);
            LinkedListNode forthNode = new LinkedListNode(40);
            LinkedListNode fifthNode = new LinkedListNode(50);

            firstNode.next = secondNode;
            secondNode.next = thirdNode;
            thirdNode.next = forthNode;
            forthNode.next = fifthNode;

            LinkedListNode result = removeNthFromEnd(firstNode, 2);
            printList(result);
        }
}
