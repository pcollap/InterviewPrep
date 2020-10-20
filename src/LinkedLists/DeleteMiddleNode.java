package LinkedLists;

public class DeleteMiddleNode {
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

        deleteMiddleNode(myNode1);
    }

    public static void deleteMiddleNode(LinkedListNode n) {
        
    }
}