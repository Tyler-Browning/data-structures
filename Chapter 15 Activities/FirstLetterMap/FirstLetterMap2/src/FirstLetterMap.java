import java.util.*;
import java.io.*;
/**
 * Read all words from a file and add them to a map
 * whose keys are the first letters of the words and
 * whose values are sets of words that start with
 * that same letter. Then print out the word sets in
 * alphabetical order. Update the map by modifying
 * Worked Example 15.1.
*/
public class FirstLetterMap
{
    public static void main(String[] args)
    {
        String filename = "Chapter 15 Activities\\FirstLetterMap\\FirstLetterMap2\\src\\test1.txt";

        try (Scanner in = new Scanner(new File(filename)))
        {
            // Create Tree Map
            Map<Character, Set<String>> first = new TreeMap<>();

            while (in.hasNext())
            {
                String w = clean(in.next());
                Character c = word.charAt(0);

                // Update the map here
                // Modify Worked Example 15.1
                
                Set<String> words = first.get(c);

                if (words == null)
                {
                    words = new TreeSet<>();
                    words.add(w);
                    firstLetters.put(c, words);
                }
                else 
                {
                    words.add(w);
                    first.put(c, words);
                }
            }

            // Print the map here in this form
            // a: [a, able, aardvark]
            
            for (Character k : first.keySet())
            {
                System.out.println(k + ": " + first.get(k));
            }

        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }
    }

    public static String clean(String s)
    {
        String r = "";
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (Character.isLetter(c))
            {
                r = r + c;
            }
        }
        return r.toLowerCase();
    }
}