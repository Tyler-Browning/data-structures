import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        // addLast
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Tony");
        staff.addLast("Natasha");
        staff.addLast("Peter");
        staff.addLast("Gamora");
        // List is TNPG

        // ListIterator method creats a new list iterator that is posistioned at the head of the list
        // The "|" is the iterator position
        ListIterator<String> i = staff.listIterator(); // |TNPG
        
        // Next method advances the iterator over the next element in the list
        i.next(); // T|NPG

        // Next method returns element the iterator is passing
        String name = i.next(); //TN|PG
        System.out.println(name); // Prints Natasha

        // Add method inserts element at iterator position, iterator then gets put after the element that was added
        i.add("Bruce"); // TNB|PG
        i.add("Rocket"); // TNBR|PG

        // Remove method removes the elemnt returned by the last call to next or previous, only called after calling next or previous
        i.next(); //TNBRP|G
        i.remove(); //TNBR|G
        System.out.println(staff); // (Peter is removed)

        // Set method updates the element returned by the last next or previous
        i.previous(); // TNB|RG
        i.set("Scott"); // TNB|SG
        System.out.println(staff); // (Scott replaces Rocket)

        // Has next method used to detirmine if there is another node after the iterator, often used in loops
        i = staff.listIterator(); // |TNBSG
        while (i.hasNext())
        {
            String n = i.next();
            if (n.equals("Natasha")) // TN|BSG
            {
                i.remove(); // T|BSG
            }
        }
        // TBSG|

        // Enhanced for loops  work with link lists
        for (String n : staff)
        {
            System.out.print(n + " ");
        }

        // Cannot modify a linked list while using an iterator unless you use the iterator to do so
        i = staff.listIterator();
        while (i.hasNext())
        {
            String n = i.next();
            if (n.equals("Scott"))
            {
                staff.remove("Scott");
            }
        }
        System.out.println();
        System.out.println(staff);

        // Enhanced for loop auto creates a iterator
        for (String n : staff)
        {
            if (n.equals("Scott"));
            {
                staff.add("Rocket");
            }
        }
    }
}
