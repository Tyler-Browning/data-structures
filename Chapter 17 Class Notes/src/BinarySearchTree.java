/**
    This class implements a binary search tree whose
    nodes hold objects that implement the Comparable
    interface.
*/
public class BinarySearchTree
{   
    private Node root;

    /**
        Constructs an empty tree.
    */
    public BinarySearchTree()
    {   
        this.root = null;
    }
    
    /**
        Inserts a new node into the tree.
        @param obj the object to insert
    */
    public void add(Comparable obj) 
    {   
        Node newNode = new Node();
        newNode.data = obj;
        newNode.left = null;
        newNode.right = null;

        if (this.root == null)
        {
            this.root = newNode;
        }
        else
        {
            this.root.addNode(newNode);
        }
    }

    /**
        Tries to find an object in the tree.
        @param obj the object to find
        @return true if the object is contained in the tree
    */
    public boolean find(Comparable obj)
    {
        Node current = this.root;

        while (current != null)
        {
            int diff = obj.compareTo(current.data);
            if (diff == 0)
            {
                return true;
            }
            else if (diff < 0)
            {
                current = current.left;
            }
            else
            {
                current = current.right;
            }
        }

        return false;
    }
    
    /**
        Tries to remove an object from the tree. Does nothing
        if the object is not contained in the tree.
        @param obj the object to remove
    */
    public void remove(Comparable obj)
    {
        Node removed = this.root;
        Node parent = null;
        boolean found = false;

        while (!found && removed != null)
        {
            int diff = obj.compareTo(removed.data)
            if (diff == 0)
            {
                found = true;
            }
            else
            {
                parent = removed;
                if (diff < 0)
                {
                    removed = removed.left;
                }
                else
                {
                    removed = removed.right;
                }
            }
        }
        if (!found)
        {
            return;
        }
        
        // Case 1 and Case 2 (One child is null)
        if (removed.left == null || removed.right == null)
        {
            Node child;

            if (removed.left == null)
            {
                child = removed.right;
            }
            else
            {
                child = removed.left;
            }

            if (parent == null)
            {
                this.root = child;
            }
            else if (parent.left == removed)
            {
                parent.left = child;
            }
            else
            {
                parent.right = child;
            }
        }
    }
    
    /**
        Prints the contents of the tree in sorted order.
    */
    public void print()
    {   
        
    }   

    /**
        Prints a node and all of its descendants in sorted order.
        @param parent the root of the subtree to print
    */
    private static void print(Node parent)
    {   
        
    }

    /**
        A node of a tree stores a data item and references
        to the left and right child nodes.
    */
    static class Node
    {   
        // MUST BE COMPARABLE
        public Comparable data;
        public Node left;
        public Node right;

        /**
            Inserts a new node as a descendant of this node.
            @param newNode the node to insert
        */
        public void addNode(Node newNode)
        {   
            // diff < 0, newNode is left
            // diff > 0, newNode is right
            int diff = newNode.data.compareTo(data);

            if (diff < 0)
            {
                if (left == null)
                {
                    left = newNode;
                }
                else
                {
                    left.addNode(newNode);
                }
            }
            else if (diff > 0)
            {
                if (right == null)
                {
                    right = newNode;
                }
                else
                {
                    right.addNode(newNode);
                }
            }
        }
    }
}



