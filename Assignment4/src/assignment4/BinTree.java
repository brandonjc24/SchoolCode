package assignment4;

import java.util.ArrayList ;

public class BinTree {
    private TNode root ;
    
    public BinTree(String[] a)throws IllegalArgumentException{
        
    }
    
    public void printTree(){
        printTree(root) ;
    }
    
    private void printTree(TNode t){
        if (t!=null){
            printTree(t.left) ;
            if (t.data == null)
                System.out.print("I ") ;
            else
                System.out.print(t.data + " ");
            printTree(t.right) ;
        }
    }
    
    public int height(){
        return height(root) ;
    }
    private int height(TNode t) {  
        int height = 0 ;
        
        if (t.right == null)
            return 1;
        return height += height(t.right) ;
    }
    
    public ArrayList<String> getCodewords(){
        TNode temp = root ;
        ArrayList<String> codeword = new ArrayList<String>() ;
        
        while(temp.right != null)
        {
            codeword.add(temp.data) ;
            temp = temp.right ;
        }
        return codeword ;
    }
    
    public String[] convert(){
        
        
        
        return arrayRep ;
    }
    
    
    public ArrayList<String> decode (String s) {
        
    }
    
    public void printLevelOrder() throws Exception{
        
    }
    
}
