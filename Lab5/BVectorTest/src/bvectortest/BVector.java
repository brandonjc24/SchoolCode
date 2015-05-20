
package bvectortest;


public class BVector{

	private int    		size;
	private boolean[]  bVectorData;	   //reference to a boolean array which stores the vector elements
	
	
	public BVector( int n )
	{       /* if n<=0 changes n to 1; it initializes the BVector object to represent the boolean vector with n elements, all set to true*/
            if (n <= 0) { n =1 ; }
            
            size = n ;
            
            bVectorData = new boolean [size] ;
            
            for( int i = 0; i < size; i++)
            {
                bVectorData[i] = true ;
            }
	}

	public BVector( boolean[] data )
	{      
		size = data.length;
		bVectorData = new boolean[size];
		
		for( int i=0; i<size; i++ ){
			bVectorData[i] = data[i];
		}

	}
	
	public int getSize()
        {     
            return size ;
	}

	public boolean getElement( int i )
	{ 	
            try{
                return bVectorData[i] ;
            }
            catch(IndexOutOfBoundsException e){
                throw new IndexOutOfBoundsException("Invalid Index") ;
            }
	}


	public void setElement( boolean  x, int i )  
	{		
            try{
                bVectorData[i] = x ;
            }
            catch(IndexOutOfBoundsException e){
                throw new IndexOutOfBoundsException("Invalid Input") ;
            }
	}
	
	public BVector logicalAnd(BVector v )
	{	
            try{
                BVector newVector = new BVector(size) ;
                for(int i=0; i < size; i++){
                    newVector.bVectorData[i] = v.bVectorData[i] & bVectorData[i] ;
                }
                return newVector ;
            }	
            catch(ArithmeticException e){
                throw new ArithmeticException("Illegal operation") ;
            }
	}

		
	public void logicalOr( BVector v)
	{	
            try{
                for(int i=0; i < size; i++){
                    this.bVectorData[i] = v.bVectorData[i] | bVectorData[i] ;
                }
            }	
            catch(ArithmeticException e){
                System.out.println("Illegal Operation");
            }		
	}


	public String toString(  )
	{			
		String output = new String();
		
		for(int i=0; i < size; i++)
			output += " " + bVectorData[i];
		return output;	
	}
}//end class
