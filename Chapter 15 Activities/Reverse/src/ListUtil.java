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
       int num = 0;
       for (String name : strings)
       {
        num++;
       }

       int len = num + 1;
       String[] array = new String[len];

       int g = num;
       
       ListIterator<String> i = strings.listIterator();
       while (i.hasNext())
       {
            String s = i.next();
            array[g] = s;
            g--;
            i.remove();
       }

       for (int q = num; q >= 0; q--)
       {
        strings.addFirst(array[q]);
       }
       
    }
}