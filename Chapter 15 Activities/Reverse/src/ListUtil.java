import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
       int len = 0;
       for (String name : strings)
       {
        len++;
       }


       ListIterator<String> i = strings.listIterator();
       int num = 0;

       i.next();
       String name = i.next();
       num++;
       num++;

       while (num != (len + 1))
       {
        i.remove();

        i = strings.listIterator();

        i.add(name);

        for (int n = num; n > 1; n--)
        {
            i.next();
        }

        if (num != len)
        {
            name = i.next();
        }
        num++;
       }

    }
}