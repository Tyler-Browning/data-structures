import java.util.Scanner;
import java.util.Stack;
import java.util.*;
/**
 * Class for reversing the order of a sentence.
*/
public class SentenceReverser
{
    /**
     * Reverses the given sentence.
     *
     * @param sentence Sentence to be reversed.
     * @return reversed sentence.
    */
    public static String reverse(String sentence)
    {
    	Scanner scanner = new Scanner(sentence);
        int count = 0;
    	String newsentence = new String();
        ArrayList periods = new ArrayList<>();
        // Complete this method. Use a Stack.
        Stack<String> stack = new Stack<>();
        while (scanner.hasNext()){
            String word = scanner.next();
            stack.push(word);
            if (word.indexOf(".") != -1){
                periods.add(count);
                int originalsize = stack.size();
                while (stack.size() > 0){
                    if (stack.peek().charAt(stack.peek().length()-1) == '.'){
                        newsentence += stack.pop().substring(0,4)+" ";
                    }
                    else if (stack.size()== 1){
                        newsentence += stack.pop().toLowerCase()+". ";
                    }
                    else if (stack.size()== originalsize){
                        //newsentence use substring to change first letter to capital
                    }
                    else 
                        newsentence += stack.pop() +" ";
                    
                    count++;
                }
                    }
        }
        
    



        return newsentence;
    }
}
