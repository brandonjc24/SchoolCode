package assignment5;

import java.util.ArrayList;

public class BinTree {
    private TNode root;
    
    public BinTree(String[] a)throws IllegalArgumentException{
        TNode b = root;
        int c;
        for(int i =0; i < a.length; i++)
        {
           b=root ;
           for(int j = 0; j < a[i].length()-1; j++)
           {
               if(a[i].charAt(j)==1)
                   b=b.right;
               else
                   b=b.left ;
           }
           c = Integer.parseInt(a[i]) % 10 ;
           if( b.data != null )
               throw new IllegalArgumentException("Not a prefix list") ;
           else{
               if(c==0)
                   b.left = new TNode( a[i], null, null );
               else
                   b.right = new TNode (a[i], null, null) ;
           }
        }
    }
    
    public void printTree(){ printTree(root); }
    
    private void printTree(TNode t){
        if (t!=null){
            printTree(t.left);
            if(t.data==null)
                System.out.print("I ");
            else
                System.out.print(t.data+" ") ;
            printTree(t.right) ;
        }
    }
    
    public int height(){ return height(root) ; }
    
    private int height(TNode t){
        if (t==null)
            return 0;
        int lheight = height(t.left) ;
        int rheight = height(t.right) ;
        
        return ( lheight > rheight ? lheight+1 : rheight+1 ) ;
    }
    
    public ArrayList<String> getCodewords(){
        return getCodewords(root);
    }
    
    private ArrayList<String>  getCodewords( TNode t)
    {
        ArrayList<String> l = new ArrayList() ;
        if (t == null)
            return l;
        if (t.left == null && t.right == null)
            l.add(t.data) ;
        getCodewords(t.left) ;
        getCodewords(t.right) ;
        
        return l ;
    }
    
    public String[] convert(){
       String[] array = new String[500] ;
       array[0] = null ;
       convert(root, array, 1) ;
        
       return array ;        
    }
    
   public void convert(TNode t, String[] array, int i){
       if (t == null)
           return;
       convert(t.left, array, i);
       array[i++] = t.data ;
       convert(t.right, array, i) ;
   }
    
    public ArrayList<String> decode(String s){
        
    }
    
    public void printLevelOrder() throws Exception{
        MyQueue q = new MyQueue() ;
        q.enqueue(root.data) ;
        int i = 0;
        while(i < height(root))
        {
            String t = q.dequeue();
        }
    }
}
