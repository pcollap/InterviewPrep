package StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueues {
    public static void main(String[] args) {
        //Good for storing order of processes
        //Enqueue/dequeue takes very little time
        //Only advantageous to use this data structure when you want
        //to use it in a manner where the first item in is the first item out

        //Linked list implementation of queue
        Queue<String> queue = new LinkedList<>();

        //Enqueue items, adding to the back of the list ess
        queue.add("Sam");
        queue.add("Anna");
        queue.add("Prashanth");
        queue.add("Lavanya");

        System.out.println(queue);

        String removedName = queue.remove();
        System.out.println(removedName);
        System.out.println(queue);


    }
}
