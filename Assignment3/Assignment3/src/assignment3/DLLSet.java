package assignment3;

public class DLLSet {
    private int setSize ;
    private DLLNode head ;
    private DLLNode tail ;
    
    public DLLSet()
    {
        setSize = 0;
        head = new DLLNode(-1, null, null);
        tail = new DLLNode(-1, head, null) ;
        head.next = tail ;
    }
    public DLLSet( int[] sortedArray )
    {
        head = new DLLNode(-1, null, null);
        tail = new DLLNode(-1, head, null) ;
        head.next = tail ;        
        setSize = sortedArray.length ;
        if(setSize == 0)
        {  head.next = tail ; tail.prev = head;  }
        else
        {
            DLLNode a = head;
            DLLNode newNode = new DLLNode( sortedArray[0], a, null ) ;
            a.next = newNode ;            
            for (int i = 1; i < setSize; i++)
            {
                a=a.next ;
                newNode = new DLLNode(sortedArray[i],a, null ) ;
                a.next = newNode ;
            }
            newNode.next = tail ;
            tail.prev = newNode ;
        }    
    }
    
    public int getSize()
    { return setSize ; }
    
    public DLLSet copy()
    {
        DLLSet newSet = new DLLSet() ;
        DLLNode newHead = new DLLNode( this.head.element, null, null ) ;
        DLLNode newTail = new DLLNode( this.tail.element, newHead, null );
        newHead.next = newTail ;
        newSet.head = newHead ;
        newSet.tail = newTail ;
        newSet.setSize = this.setSize ;
        
        if(setSize != 0)
        {
            DLLNode a = this.head.next ;
            DLLNode b = newHead ;
            
            DLLNode newNode = new DLLNode( a.element, b, null ) ;
            b.next = newNode ;
            b=b.next ;
            
            for (int i = 1; i < setSize; i++)
            {
                a=a.next ;
                newNode = new DLLNode(a.element,b, null ) ;
                b.next = newNode ;
                b=b.next ;
            }
            newNode.next = newSet.tail ;
            tail.prev = newNode ;
            
        }
        
                        
        return newSet ;
    }
    
    public boolean isIn(int v)
    {
        boolean inList = false ;
        
        for (DLLNode a = this.head.next; a.next != null; a=a.next)
        {
            if (a.element == v)
                inList = true;
        }
        
        return inList ;
    }
    
    public void add(int v)
    {
        if(!isIn(v))
        {
            DLLNode newNode = new DLLNode(v, null, null) ;
            
            DLLNode a = this.head.next ;
            while(a != this.tail)
            {               
                if(a.element > v)
                    break ; 
                a=a.next ;
            }
            a.prev.next = newNode ;
            newNode.prev = a.prev ;
            newNode.next = a ;
            a.prev = newNode ;
            
            
           this.setSize++ ; 
        }
    }
    
    public void remove(int v)
    {
        if (isIn(v))
        {
            DLLNode a = this.head.next ;
            while(a.element != v)
                a=a.next ;
            a.prev.next = a.next ; 
            a.next.prev = a.prev ;
            this.setSize-- ;
        }
    }
    
    public DLLSet union(DLLSet s)
    {
        DLLSet newSet = new DLLSet() ;
        newSet.setSize = 0 ;
        DLLNode newHead = new DLLNode( -1, null, null) ;
        DLLNode newTail = new DLLNode( -1, newHead, null );
        newHead.next = newTail ;
        
        newSet.head = newHead ;
        newSet.tail = newTail ;
        
        DLLNode a = this.head.next ;
        DLLNode b = s.head.next ;
        DLLNode newInsert = newHead ; // used to traverse the new set
        DLLNode insert ; // creates new nodes for new set
        
        for(int i = 0; i < this.setSize + s.setSize ; i++)
        {
            if( (a.element < b.element && a != this.tail) || b == s.tail) // insert a
            {
                    insert = new DLLNode(a.element, newInsert, null) ;
                    newInsert.next = insert ;
                    newSet.setSize++ ;
                    newInsert = newInsert.next ;
                    a=a.next;                
            }
            else if( (a.element > b.element && b != s.tail)|| a == this.tail) // insert b
            {
                insert = new DLLNode(b.element, newInsert, null) ;
                newInsert.next = insert ;
                newSet.setSize++;
                newInsert = newInsert.next ;
                b=b.next;                
            }
            else // a.element == b.element increment a, b and i
            {
                    a=a.next;    
                    b=b.next ;
                    i++ ;
            }      
        }

        newSet.tail.prev = newInsert ;
        newInsert.next = newSet.tail ;  
        
        return newSet ;
    }
    
    public DLLSet intersection( DLLSet s )
    {
        DLLSet newSet = new DLLSet() ;
        newSet.setSize = 0 ;
        DLLNode newHead = new DLLNode( -1, null, null) ;
        DLLNode newTail = new DLLNode( -1, newHead, null );
        newHead.next = newTail ;
        
        newSet.head = newHead ;
        newSet.tail = newTail ;
        
        DLLNode a = this.head.next ;
        DLLNode b = s.head.next ;
        DLLNode newInsert = newHead ;
        
        insertloop:
        for(int i = 0; i < this.setSize + s.setSize; i++)
        {
            if(a.element == b.element)
            {
                DLLNode insert = new DLLNode(a.element, newInsert, null) ;
                newInsert.next = insert ;
                a=a.next ;
                b=b.next ;
                newSet.setSize++ ;
                newInsert = newInsert.next ;
                i++ ;
            }
            else if ( a == this.tail || b == s.tail )
                break insertloop ;
            else if(a.element < b.element)
                a=a.next ;
            else if(a.element > b.element)
                b=b.next ;
        }
        
        newSet.tail.prev = newInsert ;
        newInsert.next = newSet.tail ;
        return newSet ;
        
    }
    
    
    public static DLLSet recUnion( DLLSet[] sArray)
    {
        return recUnion(sArray, 0, sArray.length -1) ;
    }
    
    private static DLLSet recUnion( DLLSet[] sArray, int first, int last )
    {
        if(first == last)
            return sArray[first];
        
        int middle = (first+last)/2 ;  
        
        DLLSet Left = recUnion(sArray, first, middle) ;
        DLLSet Right = recUnion(sArray, middle+1, last) ;
        
        return Left.union(Right) ; 
    }
    
    
    public static DLLSet fastUnion(DLLSet[] sArray)
    {
        int j=sArray.length/2 ;
        
        while(j > 1)
        {
            for(int i = 0 ; i < j; i++)
            {
                sArray[i] = sArray[2*i].union(sArray[2*i+1]) ;
            }
            j=j/2 ;
        }
        
        return sArray[0].union(sArray[1]) ;
    }
    
    
      public String toString() {
          String longString = "";
	if(setSize==0)
	    longString = "The set is empty";
        else{
            DLLNode p=head.next;
	    //longString = new String("");
            for (; p.next!= tail ; p=p.next) {
                longString =longString +  p.element + "\n";          
            }//end for
            longString =longString +  p.element; 
        }
        return longString;
    }
}
