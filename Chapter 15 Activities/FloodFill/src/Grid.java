import java.util.*;

public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    public Stack<Pair> stack;

    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int column)
    {
        stack = new Stack<>();
        stack.push(new Pair(3,4));

        
        while(!stack.isEmpty())
        {   
            int counter = 0;
            if(pixels[stack.pop().getRow()][stack.pop().getColumn()]==0)
            {
                // Next?
            }
        }
    }

    @Override
    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%4d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}
