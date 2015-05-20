
package assignment5;

public class MyQueue<E> {
    private QNode<E> front ;
    private QNode<E> end ;
    
    public MyQueue() {
        end = new QNode(null, null) ;
        front = end ;
    }
    
    public int getSize(){
        int size = 0;
        QNode<E> p = front ;
        while(p.next!= null){
           p=p.next ;
           size++ ;
        }
        return size ;
    }
    
    public boolean isEmpty(){
        return (front == end) ;
    }
    
    public void enqueue(E e){
        end.next = new QNode(e, null) ;
        end = end.next ;
    }
    
    public E dequeue() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue Underflow") ;
        }
        else{
            if (end==front.next)
                end = front ;
            E val = front.next.element ;
            front.next = front.next.next ;
            return val ;
        }
    }
    
}
