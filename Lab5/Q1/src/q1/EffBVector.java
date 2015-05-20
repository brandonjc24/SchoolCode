package q1;

import java.util.ArrayList;


public class EffBVector{

	private ArrayList<Integer> effData ;	// reference to an ArrayList of Integers which represents efficiently the boolean vector 
	
	public EffBVector( int n )
	{       		
		if( n<=0 )
			n=1;
		effData = new ArrayList<Integer>();
		effData.add(n);

	}

	public EffBVector( boolean[] data )
	{       /* initializes the EffBVector object to represent the boolean vector data*/

		effData = new ArrayList<Integer>();
		set( data );

	}

	public EffBVector( int[] effArray ){ /* initializes the EffBVector object 
	to represent the boolean vector whose efficient representation is the 
	sequence of integers in the integer array effArray */
		
		if(effArray[0] < 0)
			throw new IllegalArgumentException( "Invalid input.");
		else
			effData.add(effArray[0]);

		int size = effArray.length;
		for( int i=1; i<size; i++ )
			if( effArray[i] <= 0 )
				throw new IllegalArgumentException( "Invalid input.");
			else
				effData.add(effArray[i]);

	}
	
	public void set( boolean[] data )
	{	/* changes this EffBVector such that to represent efficiently the boolean vector data */
            int i = 0, pos = 0;
            boolean prev ;
            
            for(int j = 1; j < data.length ; j++){
                prev = data[j-1] ;
                
                if (data[j] == true && prev == false){
                    i++;
                    effData.set(pos++, i) ;
                    i = 0;
                }
                else if(data[j] == true){
                    i++ ;
                }
                else if(data[j] == false && prev == true){
                    i++ ;
                    effData.set(pos++, i);
                    i = 0;
                }
                else{
                    i++ ;
                }
            }
	}
	
	public boolean[] convert()
	{	/* returns an array of booleans represented by this EffBVector  */
		boolean[] newBoolArray = new boolean [this.getBVectorSize()] ;
                int i, a=0, pos = 0 ;
                boolean value = true ;
                
                for (int j = 0; j < this.getListSize() ; j++)
                {
                    i = effData.get(j) ;
                    for (a = 0; a < i; a++){
                        newBoolArray[pos++] = value ;
                    }
                    value = !value ;
                }		
                return newBoolArray ;    
	}

	public int getBVectorSize()
	{			
		int i = 0; 
                for (Integer Value: effData){
                    i += effData.get(Value) ;
                }
                return i ;
	}

	

	 public int getListSize()
	{	/* returns the number of integers in the efficient representation */
		
		return effData.size();

	}
	
	public String toString()
	{
		/* returns a string representing this EffBVector object (lists the integers in the efficient representation of the boolean vector) */
			
		String output = new String();
		int m = effData.size();

		for(int i=0; i<m; i++)
			output += " " + effData.get(i);

		return output;		
	}

}//end class