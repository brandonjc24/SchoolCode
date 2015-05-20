package assignment1;

public class WordList {
    
    private int listSize ;
    private int capList ;
    private String[] List ;
    
    public WordList( int capacity ){
        List = new String[capacity] ; 
        capList = capacity;
        listSize = 0 ;
    } 
         
    
    public WordList( String[] arrayOfWords )
    {   
        listSize = arrayOfWords.length ;
        capList = listSize * 2 ;
        List = new String[ capList ] ;
   
        
        List[0] = arrayOfWords[0] ;
        
        int wordsInserted = 1 ;
        
        int newListSize = listSize ;

        
        boolean inList = false ;
        
        for (int i = 1; i < listSize; i++) // arrayOfWords Loop 
        {
            inList = false;
            
            check:
            for (int a = 0; a < i; a++)
            {
                if (arrayOfWords[i].equals(List[a]))
                {
                    inList = true ;
                    newListSize-- ;
                    break check;
                }
            }
            
            
            if (!inList)
            {
                if ( arrayOfWords[i].compareTo(List[0]) < 0 ) // insert at beginning
                {
                    for (int k = wordsInserted; k > 0 ; k--)
                        List[k] = List[k-1] ;
                    List[0] = arrayOfWords[i] ;
                    wordsInserted++ ;
                }
                else if ( arrayOfWords[i].compareTo(List[wordsInserted-1]) > 0) // insert at end
                {
                    List[wordsInserted] = arrayOfWords[i] ;
                    wordsInserted++ ;
                }
                else
                {
                    for (int j = 0; j < wordsInserted; j++) // List Loop
                    {
                        int before = arrayOfWords[i].compareTo(List[j]) ;
                        int after = arrayOfWords[i].compareTo(List[j+1]) ;

                        if (before > 0 && after < 0)
                        {
                            for(int k = wordsInserted; k > j; k--)
                                List[k] = List[k-1] ;
                            
                            List[j+1] = arrayOfWords[i] ;
                        }
                    } // end of list loop
                    wordsInserted++ ;
                } // End of else statement
            } // end of not inlist insert statement
           
 
            //System.out.println(List[i]);
         } // end of array of words
        
        listSize = newListSize ;
        capList = listSize *2 ;
    } // end of WordList constructor
    
   
    public int getSize() { return listSize ; }
    
    public int getCapacity() { return capList ; }
    
    public String getWordAt( int i ) throws ArrayIndexOutOfBoundsException 
    {     
        if (i > listSize-1 || i < 0)
            throw new ArrayIndexOutOfBoundsException("This index is not valid");
        else
            return List[i] ;
    }
    
    public void insert( String newword ){

        int index = this.find(newword) ;
        
        if (index == -1)
        {
            if ( listSize == capList)
            {
                String[] newList = new String[capList *2] ;
                for (int j = 0; j < listSize; j++)
                    newList[j] = List[j] ;
                
                List = newList ;
                capList *= 2 ;
            }
            
            if (listSize == 0) // insert into an empty list
            {
                    List[0] = newword ;
                    listSize++ ;
            }
            
            else if ( newword.compareTo(List[0]) < 0 ) // insert at beginning
            {
                for (int i = listSize; i > 0; i--)
                    List[i] = List[i-1] ;
                
                List[0] = newword ;
                listSize++ ;
            }
            else if( newword.compareTo(List[listSize-1]) > 0) // instert at end
            {
                List[listSize] = newword ;
                listSize++ ;
            }
            else
            {
                insertloop:
                for (int i = 1; i < listSize; i++)
                {
                    if (newword.compareTo(List[i-1]) > 0 && newword.compareTo(List[i]) < 0)
                    {
                        for (int j = listSize; j > i; j--)
                        {
                            List[j] = List[j-1] ;
                        }
                        List[i] = newword ;
                        listSize++ ;
                        break insertloop ;
                    }
                }
            }
        }  
    }
    
    public int find( String word ){
        int low = 0, high = listSize-1 , middle ;
        
        while (low <= high)
        {
            middle = (high + low)/2 ;
            int result = word.compareTo(List[middle]) ;
            if(result == 0 ) 
                return middle ; 
            if( result < 0 )  
                high = middle-1 ; 
            else 
                low = middle+1 ; 
        }
        return -1 ;
    }
    
    public void remove(String word){
 
        int index = this.find(word);
        
        if(index != -1)
        {
              listSize--;
              for(int j = index; j < listSize; j++){
                  List[j] = List[j+1] ;
              }     
              List[listSize] = "" ;
        }        
    }
    

    
    public WordList sublist( char init, char fin){
        
        WordList newWordList  ;
                
        if(listSize != 0)
        {
            int j = 0, k = 0 ;
            for (int i = 0; i < listSize; i++)
            {
                if (List[i].charAt(0) >= init && List[i].charAt(0) <= fin)
                    j++ ;
            }

            String[] newSubList = new String[j] ;
                       
            for (int i = 0; i < listSize ; i++)
            {
                if (List[i].charAt(0) >= init && List[i].charAt(0) <= fin) 
                    newSubList[k++] = List[i] ;
            } 

            
            if (j == 0) // empty sublist from nonempty list
                newWordList = new WordList(capList) ;
            else                        // non empty sublist
                newWordList = new WordList(newSubList) ;

        }
        else
            newWordList = new WordList(capList) ; // empty list
        
        
        return newWordList ;
    }  
    
    public String toString() {
        
        String longString;
	if(listSize==0)
	    longString = "The list is empty";
	else
	    longString = List[0];
        
        for (int i = 1; i < listSize; i++) {
            longString =longString + "\n" + List[i];
        }
        return longString;
    }  
    
}
