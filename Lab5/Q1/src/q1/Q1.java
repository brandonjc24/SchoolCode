package q1;

public class Q1 {
    public static void main(String[] args) {
       
        // Test BVector
		// test constructor1; invalid dimension
		BVector a = new BVector(-7);
		System.out.println("Test costructor1--invalid vector dimension:" );
		System.out.println(a.toString());
		
		// test constructor1; valid dimension
		BVector b = new BVector(5);
		System.out.println("\nTest costructor1--valid dimension:" );
		System.out.println(b.toString());

				
		//test constructor2;
		boolean[] temp = {false, false, true, false, true, true}; 
		BVector c = new BVector(temp);
		System.out.println("\nTest costructor2:" );
		System.out.println(c.toString());
		

		//test getSize();
		System.out.println("\nTest getSize():");
		System.out.println(c.getSize());


		//test getElement(); valid position
		System.out.println("\nTest getElement(), valid position:");
		System.out.println(c.getElement(3));


		//test getElement(); invalid position
		try {
			System.out.println("\nTest getElement(), invalid index" );
			System.out.println(c.getElement(6));			
		}
		catch (IndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("\n");
		}

		
		//test getElement(); invalid position
		try {
			System.out.println("\nTest getElement(), invalid index" );
			System.out.println(c.getElement(-2));			
		}
		catch (IndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("\n");
		}
		
		
		//test setElement() valid position
		System.out.println("\nTest setElement()" );
		c.setElement(false,4);
		System.out.println(c.toString()); 
		

		//test setElement() invalid position
		try {
			System.out.println("\nTest setElement()" );
			c.setElement(true,7); 		
		}
		catch (IndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("\n");
		}
		
		
		//test setElement() invalid position		
		try {
			System.out.println("\nTest setElement()" );
			c.setElement(true,-10); 		
		}
		catch (IndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("\n");
		}
		
		//test logicalAND illegal
		System.out.println("\nTest logicalAnd(), illegal operation" );
		try {
			System.out.println(b.logicalAnd(c));	
		}
		catch (ArithmeticException e){
			System.out.println(e);
			System.out.println("\n");
		}

		//test logicalAND legal			
		System.out.println("Test logicalAnd(), legal operation" );
		boolean[] temp1 = {true, true, false, true}; 
		BVector d = new BVector(temp1);
		boolean[] temp2 = {true, false, false, true}; 
		BVector f = new BVector(temp2);
		System.out.println(d.logicalAnd(f));

		//d, f should not be affected
		System.out.println(d.toString());
		System.out.println(f.toString());


		//test logicalOR illegal
		System.out.println("\nTest logicalOr(), illegal operation" );
		try {
			b.logicalOr(c);	
		}
		catch (ArithmeticException e){
			System.out.println(e);
			System.out.println("\n");
		}


		//test logicalOR legal		
		System.out.println("\nTest logicalOr(), legal operation" );
		d.logicalOr(f);

		//d is changed, f is not
		System.out.println(d.toString());
		System.out.println(f.toString());

             
                
                
        //Testing EffBVector
                // test constructor1; invalid dimension
		EffBVector a1 = new EffBVector(-7);
		System.out.println("Test costructor1--invalid vector dimension:" );
		System.out.println(a1.toString());
		
		// test constructor1; valid dimension
		EffBVector b1 = new EffBVector(5);
		System.out.println("\nTest costructor1--valid dimension:" );
		System.out.println(b1.toString());
			
		//test - vector starts with false
		boolean[] temp3 = {false, false, true, false, true, true}; 
		EffBVector a = new EffBVector(temp3);
		System.out.println("vector starts with false" );
		System.out.println(a.toString());
		System.out.println(a.getBVectorSize());
		System.out.println(a.getListSize());

		System.out.println("" );
		System.out.println("test convert \n" );
		temp = a.convert();
		for(int i=0; i<temp.length;i++)
			System.out.print(temp[i]+" ");
		System.out.println("" );	

		//test - vector starts with true
		boolean[] temp4 = {true, true, true, true, false}; 
		EffBVector b = new EffBVector(temp1);
		System.out.println("" );
		System.out.println("vector starts with true" );
		System.out.println(b.toString());
		System.out.println(b.getBVectorSize());
		System.out.println(b.getListSize());

		System.out.println("" );
		System.out.println("test convert \n" );
		boolean[] temp3 = b.convert();
		for(int i=0; i<temp3.length;i++)
			System.out.print(temp3[i]+" ");
		System.out.println("" );


		//test - all true vector
		EffBVector c = new EffBVector(10);
		System.out.println("" );
		System.out.println("all true vector" );
		System.out.println(c.toString());
		System.out.println(c.getBVectorSize());
		System.out.println(c.getListSize());

		
		System.out.println("" );
		System.out.println("test convert \n" );
		boolean[] temp4 = c.convert();
		for(int i=0; i<temp4.length;i++)
			System.out.print(temp4[i]+" ");
		System.out.println("" );

		//test - set
		c.set(temp1);
		System.out.println("" );
		System.out.println("test set" );
		System.out.println(c.toString());
		System.out.println(c.getBVectorSize());
		System.out.println(c.getListSize());

		
		System.out.println("" );
		System.out.println("test convert \n" );
		boolean[] temp5 = c.convert();
		for(int i=0; i<temp5.length;i++)
			System.out.print(temp5[i]+" ");
		System.out.println("" );

		//test set
		c.set(temp);
		System.out.println("" );
		System.out.println("test set" );
		System.out.println(c.toString());
		System.out.println(c.getBVectorSize());
		System.out.println(c.getListSize());

		
		System.out.println("" );
		System.out.println("test convert \n" );
		boolean[] temp6 = c.convert();
		for(int i=0; i<temp6.length;i++)
			System.out.print(temp6[i]+" ");
		System.out.println("" );

		
		//test all false vector
		boolean[] temp2 = new boolean[25];
		c.set(temp2);
		System.out.println("" );
		System.out.println("all false vector" );
		System.out.println(c.toString());
		System.out.println(c.getBVectorSize());
		System.out.println(c.getListSize());

		
		System.out.println("" );
		System.out.println("test convert \n" );
		temp2 = c.convert();
		int j=0;
		for(int i=0; i<temp2.length;i++)
			if(temp2[i]==false) j++;
		System.out.println(""+j );
		
		


	        
        
    }
}



