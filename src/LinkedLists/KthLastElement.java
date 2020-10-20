package LinkedLists;

public class KthLastElement {
    public static void main(String[] args) {
        LinkedListNode myNode1 = new LinkedListNode(1);
        LinkedListNode myNode2 = new LinkedListNode(2);
        LinkedListNode myNode3 = new LinkedListNode(3);
        LinkedListNode myNode4 = new LinkedListNode(1);
        LinkedListNode myNode5 = new LinkedListNode(2);
        LinkedListNode myNode6 = new LinkedListNode(6);

        myNode1.setNext(myNode2);
        myNode2.setNext(myNode3);
        myNode3.setNext(myNode4);
        myNode4.setNext(myNode5);
        myNode5.setNext(myNode6);

        printKthToLastRecursively(myNode1, 3);

        printKthToLastIteratively(myNode1, 3);
    }

    public static int printKthToLastRecursively(LinkedListNode n, int k) {
        if (n == null) {
            return 0;
        }

        int index = printKthToLastRecursively(n.next, k) + 1;
        if (index == k) {
            System.out.println(k + "th to last node is " + n.data);
        }
        return index;
    }

    public static LinkedListNode printKthToLastIteratively(LinkedListNode n, int k) {
        LinkedListNode pointer1 = n;
        LinkedListNode pointer2 = n;

        /* Move p1 k nodes into the list*/
        for (int i = 0; i < k; i++) {
            if (pointer1 == null) {
                return null;
            }
            pointer1 = pointer1.next;
        }

        /* Move both pointers at the same pace, when pointer1 hits the end, p2 will be on the kth to last element*/
        while (pointer1 != null) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        System.out.println(k +"th to last node is " + pointer2.data);

        return pointer2;
    }
}
