package LinkedLists;

import java.util.LinkedList;

public class TestingLinkedList {

    public static void main(String[] args) {

        double time, web;

        LinkedList<String> myLinkedList = new LinkedList<>();

        myLinkedList.add("Prashanth");
        myLinkedList.add("Lavanya");
        myLinkedList.add("Charlie");

        myLinkedList.addFirst("Raj");
        myLinkedList.addLast("Prema");

        String firstFam = myLinkedList.getFirst();
        String lastFam = myLinkedList.getLast();
        int size = myLinkedList.size();

        System.out.println("First is " + firstFam + ", last is " + lastFam + ". Size is " + size);
        System.out.println(myLinkedList);
        System.out.println("Third fam member is " +myLinkedList.get(2));
        System.out.println("Prashanth is in index: " + myLinkedList.indexOf("Prashanth"));
        System.out.println("Charlie is in index: " + myLinkedList.indexOf("Charlie"));

        System.out.println();

        myLinkedList.removeFirstOccurrence("Prashanth");
        System.out.println("First is " + myLinkedList.getFirst() + ", last is " + myLinkedList.getLast() + ". Size is " + myLinkedList.size());
        System.out.println(myLinkedList);
        System.out.println("Third fam member is " +myLinkedList.get(2));
        System.out.println("Prashanth is in index: " + myLinkedList.indexOf("Prashanth"));
        System.out.println("Charlie is in index: " + myLinkedList.indexOf("Charlie"));

        System.out.println();

        myLinkedList.removeFirst();
        myLinkedList.removeLast();
        System.out.println("First is " + myLinkedList.getFirst() + ", last is " + myLinkedList.getLast() + ". Size is " + myLinkedList.size());
        System.out.println(myLinkedList);
        System.out.println("Second fam member is " +myLinkedList.get(1));
        System.out.println("Prashanth is in index: " + myLinkedList.indexOf("Prashanth"));
        System.out.println("Charlie is in index: " + myLinkedList.indexOf("Charlie"));

        System.out.println();

        LinkedList<Double> myLinkedList1 = new LinkedList<>();
        myLinkedList1.addFirst(Double.valueOf(7.99));
        myLinkedList1.addFirst(Double.valueOf(1.11));

        myLinkedList1.remove(Double.valueOf(1.11));
        myLinkedList1.add(Double.valueOf(18));
        System.out.println(myLinkedList1);
    }
}
