import java.util.PriorityQueue;
import java.util.Queue;


/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        // Create a to-do list
        // WorkOrder class has two elements
        Queue<WorkOrder> toDo = new PriorityQueue<>();

        toDo.add(new WorkOrder(3, "Water Plants"));
        toDo.add(new WorkOrder(2, "Make Dinner"));
        toDo.add(new WorkOrder(2, "Conquer World"));
        toDo.add(new WorkOrder(9, "Play Video Games"));
        toDo.add(new WorkOrder(1, "Study For Tests"));

        // Objects are not stored in order
        System.out.println(toDo);

        // Objects will be removed in order
        while (toDo.size() > 0)
        {
            System.out.println(toDo.remove());
        }
    }
}
