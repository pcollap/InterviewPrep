package LinkedLists;

import java.util.HashSet;

public class DeleteDuplicates {
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

        System.out.println(myNode1.data);
        System.out.println(myNode2.data);
        System.out.println(myNode3.data);
        System.out.println(myNode4.data);
        System.out.println(myNode5.data);
        System.out.println(myNode6.data);
        System.out.println();

        deleteDuplicates(myNode1);

        while (myNode1 != null) {
            System.out.println(myNode1.data);
            myNode1 = myNode1.next;
        }
    }

    public static void deleteDuplicates(LinkedListNode n) {
        HashSet<Integer> set = new HashSet<>();
        LinkedListNode previous = null;
        while (n != null) { //make sure the node we're at is not null
            if (set.contains(n.data)) { //if the set already has this data, its a duplicate, skip over it in the list by correcting the pointers
                previous.next = n.next;
            } else {
                set.add(n.data);
                previous = n;
            }
            n = n.next;
        }
    }
}
