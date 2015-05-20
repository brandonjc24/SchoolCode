package assignment2;

public class Node<String>{
    String element;
    Node<String> next;
    
    public Node( String e, Node<String> n ){
        element = e;
        next = n ;
    }
}
