import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/**
 * This program simulates a print queue. Note that documents are printed
 * in the same order as they are submitted.
*/
public class QueueDemo
{
    public static void main(String[] args)
    {
        // Create a print queue of strings (using a linked list)
        Queue<String> jobs = new LinkedList <>();

        // Add some print jobs
        jobs.add("Joe - Q2ER");
        jobs.add("Cathy - TSD");

        System.out.println("Printing: " + jobs.remove());

        jobs.add("Cathy - RTSD");
        jobs.add("Joe - GL");
        jobs.add("Cathy - CIGFFT");

        System.out.println("Printing: " + jobs.remove());

        jobs.add("Boss: CTL");

        while (jobs.size() > 0)
        {
            System.out.println(jobs.remove());
        }
    }
}
