package Collection_que;

import java.util.PriorityQueue;

public class Que_21 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(5);
        priorityQueue.offer(2);
        priorityQueue.offer(8);
        priorityQueue.offer(1);


        System.out.println("Original Priority Queue: " + priorityQueue);
        priorityQueue.clear();

        System.out.println("Priority Queue after clearing: " + priorityQueue);
    }
}
