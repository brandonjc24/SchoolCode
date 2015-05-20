package assignment5;


public class QNode<E> {
    E element;
    QNode<E> next ;
    
    QNode(E e, QNode n){
        element = e;
        next = n ;
    }
}
