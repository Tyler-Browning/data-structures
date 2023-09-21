import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This program checks which words in a file are not present in a dictionary.
*/
public class WordAnalysis
{
    public static void main(String[] args)
        throws FileNotFoundException
    {
        // Read dictionary and novel
        Set<String> dWords = readWords("Chapter 15 Class Notes/src/words");
        Set<String> nWords = readWords("Chapter 15 Class Notes/src/war-and-peace.txt");

        // Print all novel words not in dictionary
        //for (String word: nWords)
        //{
        //    if (!dWords.contains(word))
        //    {
        //        System.out.println(word);
        //    }
        //}

        // Print number of unique words
        //System.out.println("There are " + nWords.size() + " unique words in the novel");

        // Print the number of unique words with greater than 3 letters
        Iterator<String> i = nWords.iterator();
        while (i.hasNext())
        {
            if (i.next().length() > 3)
            {
                i.remove();
            }
        }
        System.out.println("There are " + nWords.size() + " unique words with more than 3 letters in the novel");

    }

    /**
     * Reads all words from a file.
     *
     * @param filename the name of the file
     * @return a set with all lowercased words in the file. Here, a
     * word is a sequence of upper- and lowercase letters.
    */
    public static Set<String> readWords(String filename)
        throws FileNotFoundException
    {
        Set<String> words = new HashSet<>();

        // Determine the current directory
        //System.out.println(System.getProperty("user.dir"));

        Scanner in = new Scanner (new File(filename), "UTF-8");

        // Use any char that is not a letter as a delimeter
        in.useDelimiter("[^a-zA-Z]+");

        while(in.hasNext())
        {
            // Add words to the set (Dupes ignored)
            words.add(in.next().toLowerCase());
        }

        return words;
    }
}
