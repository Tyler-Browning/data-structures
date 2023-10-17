import java.util.NoSuchElementException;

/**
 * A linked list is a sequence of nodes with efficient
 * element insertion and removal. This class
 * contains a subset of the methods of the standard
 * java.util.LinkedList class.
*/
public class LinkedList
{
    // First node in the list, if empty first == null
    private Node first;

    /**
        Constructs an empty linked list.
    */
    public LinkedList()
    {
        this.first = null;
    }



    /**
        Returns the first element in the linked list.
        @return the first element in the linked list
    */
    public Object getFirst()
    {
        if (this.first == null)
        {
            throw new NoSuchElementException();
        }
        return this.first.data;
    }



    /**
        Removes the first element in the linked list.
        @return the removed element
    */
    public Object removeFirst()
    {
        if (this.first == null)
        {
            throw new NoSuchElementException();
        }
        Object element = this.first.data;
        this.first = this.first.next;
        return element;
    }



    /**
        Adds an element to the front of the linked list.
        @param element the element to add
    */
    public void addFirst(Object element)
    {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = this.first;
        this.first = newNode;
    }



    /**
        Returns an iterator for iterating through this list.
        @return an iterator for iterating through this list
    */
    public ListIterator listIterator()
    {
        return new LinkedListIterator();
    }




    // Class Node
    // Static becauseit doesn't need access to anything
    static class Node
    {
        public Object data;
        public Node next;
    }

    class LinkedListIterator implements ListIterator
    {
        //private data
        private Node pos;
        private Node prev;
        private boolean isNext;

        /**
            Constructs an iterator that points to the front
            of the linked list.
        */
        public LinkedListIterator()
        {
            pos = null;
            prev = null;
            isNext = false;
        }

        /**
            Moves the iterator past the next element.
            @return the traversed element
        */
        public Object next()
        {
            if (!hasNext())
            {
                throw new NoSuchElementException();
            }
            
            prev = pos;
            isNext = true;

            if (pos == null)
            {
                pos = first;
            }
            else
            {
                pos = pos.next;
            }

            return pos.data;
        }



        /**
            Tests if there is an element after the iterator position.
            @return true if there is an element after the iterator position
        */
        public boolean hasNext()
        {
            // Check if empty
            if (this.pos == null)
        {
            return first != null;
        }

            return pos.next != null;
        }


        /**
            Adds an element before the iterator position
            and moves the iterator past the inserted element.
            @param element the element to add
        */
        public void add(Object element)
        {
            // Check if iterator is at the start
            if (pos == null)
            {
                addFirst(element);
                pos = first;
            }
            else
            {
                Node newNode = new Node();
                newNode.data = element;
                newNode.next = pos.next;
                
                // Set next element of the current position to point to the new node
                pos.next = newNode;
                pos = newNode;
            }
            isNext = false;
        }



        /**
            Removes the last traversed element. This method may
            only be called after a call to the next() method.
        */
        public void remove()
        {
            if (!hasNext())
            {
                throw new IllegalStateException();
            }

            // Check first
            if (pos == first)
            {
                removeFirst();
                pos = null;
            }
            else
            {
                prev.next = pos.next;
                pos = prev;
            }
            isNext = false;
        }



        /**
            Sets the last traversed element to a different value.
            @param element the element to set
        */
        public void set(Object element)
        {
            if (!isNext)
            {
                throw new IllegalStateException();
            }

            pos.data = element;
        }



    }//LinkedListIterator
}//LinkedList
