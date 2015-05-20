package assignment3;

public class DLLNode {
    int element ;
    DLLNode prev;
    DLLNode next;
    DLLNode( int i, DLLNode p, DLLNode n )
    {
        element = i;
        prev = p;
        next = n;
    }
}
