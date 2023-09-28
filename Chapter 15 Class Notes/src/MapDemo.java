import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {
        // Map interface generic
        // Type for key and value
        Map<String, Color> fav = new HashMap <>();

        // Add elements using the put method
        fav.put("Peter", Color.BLACK);
        fav.put("Seth", Color.BLUE);
        fav.put("Celeste", Color.ORANGE);

        // Two diffrent keys can have the same value
        fav.put("Miller", Color.ORANGE);

        // The same key cannot have two values
        fav.put("Peter", Color.YELLOW); // Replaces the old color (Black --> Yellow)

        // Create a set of the keys in a map
        Set <String> keys = fav.keySet();
        for (String key : keys)
        {
            System.out.println(key + " ("+key.hashCode()+"): " + fav.get(key));
        }
    }
}
